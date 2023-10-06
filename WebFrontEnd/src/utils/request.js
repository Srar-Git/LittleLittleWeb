import axios from "axios";
import { ElMessage } from 'element-plus';
import pinia from '../stores/index';
import { useUserInfoStore } from '../stores/userInfo';
import NProgress from "nprogress";
import "nprogress/nprogress.css";
// 配置新建一个 axios 实例
const service = axios.create({
  baseURL: "/app-dev/",
  timeout: 50000,
});

// 添加请求拦截器
service.interceptors.request.use((config) => {

  NProgress.start()//开启进度条
  // 是否需要设置 token 如果有token, 通过请求头携带给后台
  const userInfoStore = useUserInfoStore(pinia) // 如果不是在组件中调用,必须传入pinia
  const token = userInfoStore.token
  if (token) {
    // config.headers['token'] = token  // 报错: headers对象并没有声明有token, 不能随便添加
    (config.headers)['token'] = token
  }
  // get请求映射params参数
  if (config.method === 'get' && config.params) {
    let url = config.url + '?'
    console.log("1: "+url)
    for (const propName of Object.keys(config.params)) {
      console.log("2: "+url)
      console.log("propName "+propName)
      const value = config.params[propName]
      var part = encodeURIComponent(propName) + '='
      if (value !== null && typeof (value) !== 'undefined') {
        if (typeof value === 'object') {
          for (const key of Object.keys(value)) {
            if (value[key] !== null && typeof (value[key]) !== 'undefined') {
              const params = propName + '[' + key + ']'
              const subPart = encodeURIComponent(params) + '='
              url += subPart + encodeURIComponent(value[key]) + '&'
            }
          }
        } else {
          url += part + encodeURIComponent(value) + '&'
        }
      }
    }

    url = url.slice(0, -1)
    config.params = {}
    // config.url = "/article/articleList?pageNum=1&pageSize=10&categoryId=2"

    config.url = url
  }
  // console.log("3: "+config.url)

  return config
}, error => {
  console.log(error)
});

// 添加响应拦截器
service.interceptors.response.use(
  (response) => {
  NProgress.done()//关闭进度条

    if(response.data.code !== 200){
    // 判断响应状态码
    if (response.data.code == 501)  return  Promise.reject(ElMessage.error("用户名有误"))
    else if (response.data.code == 503) return  Promise.reject(ElMessage.error("密码有误"))
    else if (response.data.code == 504) return  Promise.reject(ElMessage.error("登录已过期"))
    else if (response.data.code == 505) return  Promise.reject(ElMessage.error("用户名占用"))
    } else {
      return response.data.data; /* 返回成功响应数据中的data属性数据 */
    }
  },
  (error) => {
  NProgress.done()//关闭进度条
    return Promise.reject(error.message);
  }
);

export default service;
