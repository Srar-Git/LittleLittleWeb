<template>

  <nav class="navbar navbar-expand-lg ">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">Navbar</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="#">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Link</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" id="navbarDropdown" aria-expanded="false">
              Dropdown
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
              <li><a class="dropdown-item" href="#">Action</a></li>
              <li><a class="dropdown-item" href="#">Another action</a></li>
              <li><hr class="dropdown-divider"></li>
              <li><a class="dropdown-item" href="#">Something else here</a></li>
            </ul>
          </li>
          <li class="nav-item">
            <a class="nav-link disabled">Disabled</a>
          </li>
        </ul>
        <form class="d-flex" role="search">
          <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-success" type="submit">Search</button>

<!--          github-->
          <a
            href="https://github.com/AnLan1214090013/LittleLittleWeb"
            class="nav-link d-flex cursor-pointer align-items-center"
          >
            <svg
              width="20px"
              height="20px"
              class="me-2 opacity-6"
              viewBox="0 0 24 24"
              aria-hidden="true"
              data-testid="GitHubIcon"

            >
              <path
                d="M12 1.27a11 11 0 00-3.48 21.46c.55.09.73-.28.73-.55v-1.84c-3.03.64-3.67-1.46-3.67-1.46-.55-1.29-1.28-1.65-1.28-1.65-.92-.65.1-.65.1-.65 1.1 0 1.73 1.1 1.73 1.1.92 1.65 2.57 1.2 3.21.92a2 2 0 01.64-1.47c-2.47-.27-5.04-1.19-5.04-5.5 0-1.1.46-2.1 1.2-2.84a3.76 3.76 0 010-2.93s.91-.28 3.11 1.1c1.8-.49 3.7-.49 5.5 0 2.1-1.38 3.02-1.1 3.02-1.1a3.76 3.76 0 010 2.93c.83.74 1.2 1.74 1.2 2.94 0 4.21-2.57 5.13-5.04 5.4.45.37.82.92.82 2.02v3.03c0 .27.1.64.73.55A11 11 0 0012 1.27"
              ></path>
            </svg>
            Github
          </a>
        </form>




      </div>
    </div>
  </nav>

<!--  <b-navbar toggleable="lg" type="light" variant="light"  fixed="top" class="justify-content-between " style="border-radius: 10px">-->
<!--    <div class="container">-->
<!--      <b-navbar-brand href="#" style=""><img src="../../../static/img/icon/LLW.png" width="59" ></b-navbar-brand>-->
<!--      <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>-->
<!--      <b-collapse id="nav-collapse"  is-nav>-->


<!--        <b-navbar-nav  >-->
<!--          <svg t="1695213574640"-->
<!--               style="opacity: .6;margin-top: 0.2rem;margin-left: 1rem;margin-right: 0.6rem"-->
<!--               viewBox="0 0 1024 1024"-->
<!--               xmlns="http://www.w3.org/2000/svg"-->
<!--               p-id="4003"-->
<!--               width="24px"-->
<!--               height="24px"-->
<!--          >-->
<!--            <path-->
<!--              d="M448 85.333333a362.666667 362.666667 0 0 1 284.842667 587.178667l193.28 193.28a42.666667 42.666667 0 0 1-60.288 60.373333l-193.365334-193.28A362.666667 362.666667 0 1 1 448 85.333333z m0 85.333334a277.333333 277.333333 0 1 0 0 554.666666 277.333333 277.333333 0 0 0 0-554.666666z"-->
<!--              fill="#000000" p-id="4004"-->
<!--            >-->

<!--            </path>-->
<!--          </svg>-->
<!--          <b-nav-form>-->
<!--            <b-form-input  class="form-control me-2 w-120" style="border-radius: 5px;height: 30px" placeholder="在此输入查找内容"></b-form-input>-->

<!--          </b-nav-form>-->
<!--        </b-navbar-nav>-->


<!--        &lt;!&ndash; Right aligned nav items &ndash;&gt;-->
<!--        <b-navbar-nav class="ms-auto" >-->
<!--          <div style="display: flex;">-->
<!--            <svg style="flex: 1;margin-top: 0.5rem;margin-right: -0.5rem" t="1697960537880" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="2765" width="20" height="20"><path d="M320 320H160L320 160z m448-96v576a96 96 0 0 1-96 96h-448A96 96 0 0 1 128 800V384h256V128h288A96 96 0 0 1 768 224z m-192 512a32 32 0 0 0-32-32h-256a32 32 0 0 0 0 64h256a32 32 0 0 0 32-32z m64-128a32 32 0 0 0-32-32h-320a32 32 0 0 0 0 64h320a32 32 0 0 0 32-32z m0-128a32 32 0 0 0-32-32h-320a32 32 0 0 0 0 64h320a32 32 0 0 0 32-32z m0-192a32 32 0 0 0-32-32H475.968a32 32 0 0 0 0 64H608a32 32 0 0 0 32-32z" fill="#111111" p-id="2766"></path></svg>-->
<!--            <b-nav-item-dropdown style="flex: 2" text="文章列表" left>-->

<!--              <b-nav-item-dropdown text="按照文章类别查看" left>-->
<!--                <b-dropdown-item :href="'/Share?classId='+item.id" v-for="(item,index) in classListObj" :key="'class1'+index" :index="'/Share?classId='+item.id">{{ item.categoryName }}</b-dropdown-item>-->
<!--              </b-nav-item-dropdown>-->


<!--              <b-dropdown-item > 按照发布时间查看 </b-dropdown-item>-->


<!--            </b-nav-item-dropdown>-->
<!--          </div>-->

<!--          <b-nav-item href="#detail">详情</b-nav-item>-->
<!--          <b-nav-item href="#skill">专业技能</b-nav-item>-->

<!--&lt;!&ndash;          <div class="userInfo">&ndash;&gt;-->
<!--&lt;!&ndash;            <div v-show="!haslogin" class="nologin">&ndash;&gt;-->
<!--&lt;!&ndash;              <a href="javascript:void(0);" @click="logoinFun(1)">登录&nbsp;</a>|<a href="javascript:void(0);"&ndash;&gt;-->
<!--&lt;!&ndash;                                                                                    @click="logoinFun(0)">&nbsp;注册</a>&ndash;&gt;-->
<!--&lt;!&ndash;            </div>&ndash;&gt;-->
<!--&lt;!&ndash;            <div v-show="haslogin" class="haslogin">&ndash;&gt;-->
<!--&lt;!&ndash;              <i class="fa fa-fw fa-user-circle userImg"></i>&ndash;&gt;-->
<!--&lt;!&ndash;              <ul class="haslogin-info">&ndash;&gt;-->
<!--&lt;!&ndash;                <li>&ndash;&gt;-->
<!--&lt;!&ndash;                  <a href="#/UserInfo">个人中心</a>&ndash;&gt;-->
<!--&lt;!&ndash;                </li>&ndash;&gt;-->
<!--&lt;!&ndash;                <li>&ndash;&gt;-->
<!--&lt;!&ndash;                  <a href="javascript:void(0);" @click="userlogout">退出登录</a>&ndash;&gt;-->
<!--&lt;!&ndash;                </li>&ndash;&gt;-->
<!--&lt;!&ndash;              </ul>&ndash;&gt;-->
<!--&lt;!&ndash;            </div>&ndash;&gt;-->
<!--&lt;!&ndash;          </div>&ndash;&gt;-->

<!--        </b-navbar-nav>-->



<!--      </b-collapse>-->




<!--    </div>-->
<!--    </b-navbar>-->

<!--  <div class="headBox">-->
<!--    <el-menu :default-active="activeIndex" class="el-menu-demo" mode="horizontal"  @select="handleSelect"-->
<!--             :router="true" style="align-items: end">-->


<!--      <el-menu-item index="/Home23" style="left: 0px">-->
<!--          <img src="../../../static/img/icon/LLW.png" width="59" >-->
<!--      </el-menu-item>-->
<!--      <el-submenu index="/Share">-->
<!--        <template slot="title"><i class="fa fa-wa fa-archive"></i> 分类</template>-->
<!--        <el-menu-item v-for="(item,index) in classListObj" :key="'class1'+index"-->
<!--                      :index="'/Share?classId='+item.id">{{ item.categoryName }}-->
<!--        </el-menu-item>-->
<!--      </el-submenu>-->
<!--      <el-menu-item index="/Reward"><i class="fa fa-wa fa-cny"></i> 赞赏</el-menu-item>-->
<!--      <el-menu-item index="/Friendslink"><i class="fa fa-wa fa-users"></i>友链</el-menu-item>-->

<!--      <div class="userInfo">-->
<!--        <div v-show="!haslogin" class="nologin">-->
<!--          <a href="javascript:void(0);" @click="logoinFun(1)">登录&nbsp;</a>|<a href="javascript:void(0);"-->
<!--                                                                                @click="logoinFun(0)">&nbsp;注册</a>-->
<!--        </div>-->
<!--        <div v-show="haslogin" class="haslogin">-->
<!--          <i class="fa fa-fw fa-user-circle userImg"></i>-->
<!--          <ul class="haslogin-info">-->
<!--            <li>-->
<!--              <a href="#/UserInfo">个人中心</a>-->
<!--            </li>-->
<!--            <li>-->
<!--              <a href="javascript:void(0);" @click="userlogout">退出登录</a>-->
<!--            </li>-->
<!--          </ul>-->
<!--        </div>-->
<!--      </div>-->
<!--    </el-menu>-->
<!--  </div>-->
</template>


<script>
import {logout} from '../../api/user'
import {removeToken} from '../../utils/auth'
import {getCategoryList} from '../../api/category'

import {
  Typeit
} from '../../utils/plug.js'


export default {
  data() { //选项 / 数据
    return {
      userInfo: '', //用户信息
      haslogin: false, //是否已登录
      classListObj: '', //分类
      activeIndex: '/', //当前选择的路由模块
      state: '', //icon点击状态
      pMenu: true, //手机端菜单打开
      // path:'',//当前打开页面的路径
      input: '', //input输入内容
      headBg: 'url(static/img/bg/966316.jpg)', //头部背景图
      headTou: '', //头像
      projectList: '' //项目列表
    }
  },
  methods: { //事件处理器
    handleOpen(key, keyPath) { //分组菜单打开
      // console.log(key, keyPath);
    },
    handleClose(key, keyPath) { //分组菜单关闭
      // console.log(key, keyPath);
    },
    searchChangeFun(e) { //input change 事件
      // console.log(e)
      if (this.input == '') {
        this.$store.state.keywords = '';
        this.$router.push({path: '/'});
      }
    },
    getCategoryList() {
      getCategoryList().then((response) => {
        this.classListObj = response
      })
    },
    handleSelect(key, keyPath) { //pc菜单选择
      //    console.log(key, keyPath);
    },
    logoinFun: function (msg) { //用户登录和注册跳转
      // console.log(msg);
      localStorage.setItem('logUrl', this.$route.fullPath);
      // console.log(666,this.$router.currentRoute.fullPath);
      if (msg == 0) {
        this.$router.push({
          path: '/Login?login=0'
        });
      } else {
        this.$router.push({
          path: '/Login?login=1'
        });
      }
    },
    // 用户退出登录
    userlogout: function () {
      var that = this;
      this.$confirm('是否确认退出?', '退出提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        // console.log(that.$route.path);

        logout().then((response) => {
          removeToken()
          localStorage.removeItem('userInfo');
          that.haslogin = false;
          window.location.reload();
          that.$message({
            type: 'success',
            message: '退出成功!'
          });
          if (that.$route.path == '/UserInfo') {
            that.$router.push({
              path: '/'
            });
          }
        })
      }).catch(() => {
        //
      });

    },
    routeChange: function () {
      var that = this;
      that.pMenu = true
      this.activeIndex = this.$route.path == '/' ? '/Home' : this.$route.path;
      if (localStorage.getItem('userInfo')) { //存储用户信息
        that.haslogin = true;
        that.userInfo = JSON.parse(localStorage.getItem('userInfo'));
        // console.log(that.userInfo);
      } else {
        that.haslogin = false;
      }
      //获取分类
      this.getCategoryList()

      if ((this.$route.name == "Share" || this.$route.name == "Home") && this.$store.state.keywords) {
        this.input = this.$store.state.keywords;
      } else {
        this.input = '';
        this.$store.state.keywords = '';
      }
    }
  },
  components: { //定义组件

  },
  watch: {
    // 如果路由有变化，会再次执行该方法
    '$route': 'routeChange'
  },
  created() { //生命周期函数
    //判断当前页面是否被隐藏
    var that = this;
    var hiddenProperty = 'hidden' in document ? 'hidden' :
      'webkitHidden' in document ? 'webkitHidden' :
        'mozHidden' in document ? 'mozHidden' :
          null;
    var visibilityChangeEvent = hiddenProperty.replace(/hidden/i, 'visibilitychange');
    var onVisibilityChange = function () {
      if (!document[hiddenProperty]) { //被隐藏
        if (that.$route.path != '/DetailShare') {
          if (localStorage.getItem('userInfo')) {
            that.haslogin = true;
          } else {
            that.haslogin = false;
          }
        }
      }
    }
    document.addEventListener(visibilityChangeEvent, onVisibilityChange);
    // console.log();
    this.routeChange();


  },
  mounted() { //页面元素加载完成
    var that = this;
    var timer = setTimeout(function () {
      // Typeit(that.$store.state.themeObj.user_start, "#luke"); //打字机效果
      clearTimeout(timer);
    }, 500);
    $(document).ready(() => {
      // 启用下拉菜单
      $('.dropdown-toggle').dropdown();
      // 启用弹出框
      $('[data-ds-toggle="popover"]').popover();
      // 其他Bootstrap组件...
    });
  }
}
</script>

<style>
/*********头部导航栏********/

/*头部导航栏盒子*/

.headBack {
  width: 100%;
  background: rgba(255, 255, 255, 0.92);
  /*margin-bottom:30px;*/
  box-shadow: 0 4px 6px 0 rgba(0, 0, 0, .2), 0 0 7px 0 rgba(0, 0, 0, .3);
  position: fixed;
  left: 0%;
  top: 1%;
  right: 0;
  z-index: 100;
  border-radius: 12px;
}

.headBox li.is-active {
  /*background: #48456C;*/
  background: rgb(231, 55, 55);
}

.el-menu--horizontal > .el-submenu.is-active .el-submenu__title {
  border-bottom: none !important;
}

.headBox .el-menu {
  background: transparent;
  border-bottom: none !important;
}

.headBox .el-menu-demo li.el-menu-item,
.headBox .el-menu--horizontal .el-submenu .el-submenu__title {
  height: 48px;
  line-height: 48px;
  border-bottom: none !important;

}

.headBox .el-submenu li.el-menu-item {
  height: 38px;
  line-height: 38px;
}

.headBox li .fa-wa {
  vertical-align: baseline;
}

.headBox ul li.el-menu-item,
.headBox ul li.el-menu-item.is-active,
.headBox ul li.el-menu-item:hover,
.headBox .el-submenu div.el-submenu__title,
.headBox .el-submenu__title i.el-submenu__icon-arrow {
  color: rgb(68, 67, 67);
}

.headBox .el-menu--horizontal .el-submenu > .el-menu {
  top: 38px;
  border: none;
  padding: 0;
}

.headBox > ul li.el-menu-item:hover,
.headBox > ul li.el-submenu:hover .el-submenu__title {
  background: rgba(73, 69, 107, 0.7);
  border-bottom: none;
}

.headBox > ul .el-submenu .el-menu,
.headBox > ul .el-submenu .el-menu .el-menu-item {
  background: #48456C;
}

.headBox > ul .el-submenu .el-menu .el-menu-item {
  min-width: 0;
}

.headBox > ul .el-submenu .el-menu .el-menu-item:hover {
  background: #25b5c2;
}

/*pc搜索框*/

.headBox .pcsearchbox {
  padding: 0;
  max-width: 170px;
  /*min-width: 30px;*/
  height: 100%;
  line-height: 38px;
  position: absolute;
  top: 0;
  right: 0;
  cursor: pointer;
}

.headBox .pcsearchbox:hover .pcsearchinput {
  opacity: 1;
  /*transform: scaleX(1);*/
  visibility: visible;
}

.headBox .pcsearchbox i.pcsearchicon {
  color: #fff;
  padding-left: 10px;
}

.headBox .pcsearchbox .pcsearchinput {
  width: 180px;
  padding: 10px 20px 10px 20px;
  background: rgba(40, 42, 44, 0.6);
  border-radius: 0 0 2px 2px;
  position: absolute;
  right: 0;
  top: 38px;
  opacity: 0;
  visibility: hidden;
  /*transform: scaleX(0);*/
  transform-origin: right;
  transition: all 0.3s ease-out;
}

.headBox .pcsearchbox .hasSearched {
  opacity: 1;
  /*transform: scaleX(1);*/
  visibility: visible;
}

.headBox .pcsearchbox .el-input {
  width: 100%;
}

.headBox .el-input__inner {
  height: 30px;
  border: none;
  background: #fff;
  /*border: 1px solid #333;*/
  border-radius: 2px;
  padding-right: 10px;
}

.headBox .userInfo {
  height: 100%;
  line-height: 38px;
  position: absolute;
  right: 30px;
  top: 0;
  color: #fff;
}

.headBox .userInfo a {
  color: #fff;
  font-size: 13px;
  transition: all 0.2s ease-out;
}

.headBox .userInfo a:hover {
  color: #48456C;
}

.headBox .nologin {
  text-align: right;
}

.headBox .haslogin {
  text-align: right;
  position: relative;
  min-width: 80px;
  cursor: pointer;
}

.headBox .haslogin:hover ul {
  visibility: visible;
  opacity: 1;
}

.headBox .haslogin ul {
  background: rgba(40, 42, 44, 0.6);
  padding: 5px 10px;
  position: absolute;
  right: 0;
  visibility: hidden;
  opacity: 0;
  transition: all 0.3s ease-out;
}

.headBox .haslogin ul li {
  border-bottom: 1px solid #48456C;
}

.headBox .haslogin ul li:last-child {
  border-bottom: 1px solid transparent;
}

/*******移动端*******/

.mobileBox {
  position: relative;
  height: 38px;
  line-height: 38px;
  color: #fff;
}

.hideMenu {
  position: relative;
  width: 100%;
  height: 100%;
  line-height: 38px;
}

.hideMenu ul.mlistmenu {
  width: 100%;
  position: absolute;
  left: 0;
  top: 100%;
  box-sizing: border-box;
  z-index: 999;
  box-shadow: 0 2px 6px 0 rgba(0, 0, 0, .12), 0 0 8px 0 rgba(0, 0, 0, .04);
  background: #48456C;
  color: #fff;
  border-right: none;
}

.hideMenu .el-submenu .el-menu {
  background: #64609E;
}

.hideMenu .el-menu-item,
.hideMenu .el-submenu__title {
  color: #fff;
}

.hideMenu > i {
  position: absolute;
  left: 10px;
  top: 12px;
  width: 30px;
  height: 30px;
  font-size: 16px;
  color: #fff;
  cursor: pointer;
}

.hideMenu .el-menu-item,
.el-submenu__title {
  height: 40px;
  line-height: 40px;
}

.mobileBox .searchBox {
  padding-left: 40px;
  width: 100%;
  box-sizing: border-box;
}

.mobileBox .searchBox .el-input__inner {
  display: block;
  border-radius: 2px;
  border: none;
  height: 25px;
}

.hideMenu ul.mlistmenu.pshow {
  display: block;
}

.hideMenu ul.mlistmenu .el-submenu__icon-arrow,
.mobileBox li.el-menu-item a {
  color: #fff;
}

.hideMenu > ul li.el-menu-item:hover,
.hideMenu > ul li.el-menu-item.is-active {
  background: #48576a;
}


/*头部背景图*/

.headImgBox {
  height: 650px;
  position: relative;
  width: 100%;
  background-size: cover;
  background-position: center 50%;
  background-repeat: no-repeat;
  margin-bottom: 90px;
}

.h-information {
  text-align: center;
  width: 100%;
  margin: auto;
  position: relative;
  top: 180px;
//padding: 10px 0; font-size: 16px;
//opacity: 0.98; //background: rgba(230, 244, 249, 0.8); //border-radius: 5px; z-index: 1;
  animation: b 1s ease-out;
  -webkit-animation: b 1s ease-out;
}

@-webkit-keyframes b {
  0% {
    -webkit-transform: translateY(90px);
    transform: translateY(90px);
  }
  80% {
    -webkit-transform: translateY(5px);
    transform: translateY(5px)
  }
  90% {
    -webkit-transform: translateY(-5px);
    transform: translateY(-5px)
  }
  to {
    -webkit-transform: translateY(0);
    transform: translateY(0)
  }
}

@keyframes b {
  0% {
    -webkit-transform: translateY(90px);
    transform: translateY(90px);
  }
  80% {
    -webkit-transform: translateY(5px);
    transform: translateY(5px)
  }
  90% {
    -webkit-transform: translateY(-5px);
    transform: translateY(-5px)
  }
  to {
    -webkit-transform: translateY(0);
    transform: translateY(0)
  }
}

.h-information img {
//width: 1200px;
  position: relative;
  width: 50%;
//border-radius: 100%;
//transition: all .4s ease-in-out;
//-webkit-transition: all .4s ease-in-out;
//object-fit: cover;
}

.h-information img:hover {
  width: 52%;
}

.h-information h2 {
  margin-top: 10px;
  font-size: 18px;
  font-weight: 700;
  /*font-family: 'Sigmar One';*/
}

.h-information h2 a {
  background: linear-gradient(to right, #DF2050, #48456D);
  -webkit-background-clip: text;
  color: transparent;
}

.headImgBox .scene {
  width: 100%;
  /*height:300px;*/
  text-align: center;
  font-size: 100px;
  font-weight: 200;
  color: #fff;
  position: absolute;
  left: 0;
  top: 160px;
  font-family: 'Sigmar One', Arial;
  text-shadow: 0 2px 2px #47456d;

}

.headImgBox .scene span {
  transform: matrix(1, 0, 0, 1, 0, 0);
  -webkit-transform: matrix(1, 0, 0, 1, 0, 0);
  text-shadow: 1px 1px 0 #ff3f1a, -1px -1px 0 #00a7e0;
}

.saying:after {
  content: "|";
  font-family: Arial, sans-serif;
  font-size: 1em;
  /*line-height: 0;*/
  display: inline-block;
  vertical-align: baseline;
  opacity: 1;
  text-shadow: 1px 1px 0 #ff3f1a, -1px -1px 0 #00a7e0;
  animation: caret 500ms infinite;
}

@keyframes caret {
  0%,
  100% {
    opacity: 1;
  }
  50% {
    opacity: 0;
  }
}
</style>
