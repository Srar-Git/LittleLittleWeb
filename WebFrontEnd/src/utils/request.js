import axios from "axios";
import { ElMessage } from 'element-plus';
import pinia from '../stores/index';
import { useUserInfoStore } from '../stores/userInfo';
import NProgress from "nprogress";
import "nprogress/nprogress.css";
import errorCode from '../utils/errorCode.js'
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
  console.log("3: "+config.url)

  return config
}, error => {
  console.log(error)
});

// 响应拦截器
service.interceptors.response.use(res => {
      // 未设置状态码则默认成功状态
      const code = res.data.code || 200
      // 获取错误信息
      const msg = errorCode[code] || res.data.msg || errorCode['default']
      if (code === 401) {
        MessageBox.confirm('登录状态已过期，您可以继续留在该页面，或者重新登录', '系统提示', {
              confirmButtonText: '重新登录',
              cancelButtonText: '取消',
              type: 'warning'
            }
        ).then(() => {

          localStorage.setItem('logUrl', router.currentRoute.fullPath);
          router.push({
            path: '/Login?login=1'
          });

        }).catch(() => { })
        return Promise.reject('无效的会话，或者会话已过期，请重新登录。')
      } else if (code === 500) {
        Message({
          message: msg,
          type: 'error'
        })
        return Promise.reject(new Error(msg))
      } else if (code !== 200) {
        Notification.error({
          title: msg
        })
        return Promise.reject('error')
      } else {
        // 把字符串total 转换成 数字 total
        if (res.data.data && res.data.data.total) {
          res.data.data.total = parseInt(res.data.data.total)
        }
        return res.data.data
      }
    },
    error => {
      console.log('err' + error)
      let { message } = error
      if (message === 'Network Error') {
        message = '后端接口连接异常'
      } else if (message.includes('timeout')) {
        message = '系统接口请求超时'
      } else if (message.includes('Request failed with status code')) {
        message = '系统接口' + message.substr(message.length - 3) + '异常'
      }
      Message({
        message: message,
        type: 'error',
        duration: 5 * 1000
      })
      return Promise.reject(error)
    }
)

export default service;
