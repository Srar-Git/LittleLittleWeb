<script setup>
import { onMounted } from "vue";

// example components
import Navbar from "../../components/NavbarDefaulFixedForDark.vue";
import Header from "../Home/Sections/Header.vue";

//Vue Material Kit 2 components
import MaterialInput from "../../components/MaterialInput.vue";
import MaterialSwitch from "../../components/MaterialSwitch.vue";
import MaterialButton from "../../components/MaterialButton.vue";

// material-input
import setMaterialInput from "../../assets/js/material-input";
onMounted(() => {
  setMaterialInput();
});
</script>
<script>
//登陆
import {userLogin,userRegister} from '../../api/user.js'
import {setToken} from '../../utils/auth.js'
export default {
  name: 'Login',
  data() { //选项 / 数据
    return {
      username: '',//用户名
      email: '',//邮箱
      password: '',//密码
      nusername: '',//新用户注册名
      nemail: '',//新用户注册邮箱
      npassword: '',//新用户注册密码
      npassword2: '',//新用户注册重复密码
      login: 0,//是否已经登录
      loginErr: false,//登录错误
      loginTitle:'用户名或密码错误',
      nusernameErr:false,//新用户注册用户名错误
      nemailErr: false,//新用户注册邮箱错误
      npasswordErr: false,//新用户注册密码错误
      npassword2Err: false,//新用户注册重复密码错误
      registerErr: false,//已注册错误
      registerTitle: '该邮箱已注册',
      step: 1,//注册进度
      fullscreenLoading: false,//全屏loading
      urlstate: 0,//重新注册
    }
  },
  methods: { //事件处理器
    routeChange:function(){
      var that = this;
      that.login = that.$route.query.login===undefined?1:parseInt(that.$route.query.login);//获取传参的login
      that.urlstate = that.$route.query.urlstate===undefined?0:that.$route.query.urlstate;//获取传参的usrlstate状态码
      // console.log(that.login,that.urlstate);

    },
    loginEnterFun: function(e){
      var keyCode = window.event? e.keyCode:e.which;
      // console.log('回车登录',keyCode,e);
      if(keyCode === 13 ){
        this.gotoHome();
      }
    },
    gotoHome:function(){//用户登录

      userLogin(this.username,this.password).then((response)=>{
        // 登录成功记录token和用户信息，登录失败给对应提示
        setToken(response.token)
        // 存储用户信息
        localStorage.setItem("userInfo",JSON.stringify(response.userInfo))
        // if(localStorage.getItem('logUrl')){
        //   this.$router.push({path:localStorage.getItem('logUrl')});
        // }else{
        //   this.$router.push({path:'/'});
        // }
        this.$router.push({path:'/'});
        console.log(this.$router)
      })

    },
    registerEnterFun: function(e){
      var keyCode = window.event? e.keyCode:e.which;
      // console.log('回车注册',keyCode,e);
      if(keyCode === 13 ){
        this.newRegister();
      }
    },
    newRegister:function(){//注册提交
      var that = this;
      var reg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/ ;
      var preg = /^(\w){6,12}$/;
      if(that.nusername){
        that.nusernameErr = false;
      }else{
        that.nusernameErr = true;
      }
      if(reg.test(that.nemail)){
        that.nemailErr = false;
      }else{
        that.nemailErr = true;
      }
      if(that.npassword&&preg.test(that.npassword)){
        that.npasswordErr = false;
        if(that.npassword==that.npassword2){
          that.npassword2Err = false;
        }else{
          that.npassword2Err = true;
        }
      }else{
        that.npasswordErr = true;
      }
      if(!that.nusernameErr&&!that.nemailErr&&!that.npasswordErr){
        that.fullscreenLoading = true;
        userRegister(that.nusername,that.nnickName,that.nemail,that.npassword).then((response)=>{
          //注册成功后调整到登录
          that.goLogin()
        }).catch((error)=>{
          that.fullscreenLoading = false;
        })
      }
    },
    goLogin:function(){//去登陆
      this.$router.push({path:'/Login?login=1'});
    },
    goRegister: function(){//去注册
      this.$router.push({path:'/Login?login=0'});
    }

  },
  components: { //定义组件

  },
  watch: {
    // 如果路由有变化，会再次执行该方法
    '$route':'routeChange'
  },
  created() { //生命周期函数
    var that = this;
    that.routeChange();
  }
}


</script>
<template>
  <div class="container">
    <Navbar transparent />
  </div>

  <Header>
    <div
        class="page-header align-items-start min-vh-100"
        :style="{
        backgroundImage:
          'url(https://images.unsplash.com/photo-1497294815431-9365093b7331?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1950&q=80)'
      }"
        loading="lazy"
    >
      <span class="mask bg-gradient-dark opacity-6"></span>
      <div class="container my-auto">
        <div class="row">
          <div class="col-lg-4 col-md-8 col-12 mx-auto">
            <div class="card z-index-0 fadeIn3 fadeInBottom">
              <div
                  class="card-header p-0 position-relative mt-n4 mx-3 z-index-2"
              >
                <div
                    class="bg-gradient-success shadow-success border-radius-lg py-3 pe-1"
                >
<!--                  <img src="../../assets/img/icon/logo.png" height="79.3" width="341" alt="">-->
                  <h3
                      class="text-white font-weight-bolder text-center mt-0 mb-0"
                  >
                    登    陆
                  </h3>

                </div>
              </div>
              <div class="card-body">
                <form role="form" class="text-start">
                  <MaterialInput
                      id="username"
                      class="input-group-outline my-3"
                      :label="{ text: '用户名', class: 'form-label' }" />
<!--                      type="email"-->

                  <MaterialInput
                      id="password"
                      class="input-group-outline mb-3"
                      :label="{ text: '密码', class: 'form-label' }"
                      type="password"
                  />
                  <MaterialSwitch
                      class="d-flex align-items-center mb-3"
                      id="rememberMe"
                      labelClass="mb-0 ms-3"
                      checked
                  >记住密码</MaterialSwitch
                  >

                  <div class="text-center" @click="gotoHome">
                    <MaterialButton
                        class="my-4 mb-2"
                        variant="gradient"
                        color="success"

                        fullWidth
                    >登陆</MaterialButton
                    >
                  </div>
                  <p class="mt-4 text-sm text-center">
                    没有账号?
                    <a
                        href="#"
                        class="text-success text-gradient font-weight-bold"
                    >请联系buptanlan@gmail.com申请</a
                    >
                  </p>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>

    </div>
  </Header>
</template>
