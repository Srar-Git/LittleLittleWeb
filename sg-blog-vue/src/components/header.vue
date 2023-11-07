<!-- 头部公用 -->


<template>

  <div class="">
<!--    <div class="headBack">-->
          <!-- pc端导航 -->
      <navv></navv>
<!--    </div>-->
    <div class="headImgBox"
         :style="{backgroundImage:this.$store.state.themeObj.top_image?'url('+this.$store.state.themeObj.top_image+')':'url(static/img/bg/966316.jpg)'}">
      <div class="h-information">
        <img
          :src="this.$store.state.themeObj.head_portrait?this.$store.state.themeObj.head_portrait:'static/img/icon/logo.png'"
          alt="">
      </div>
    </div>
  </div>
</template>

<script>
import navbar from '../components/smallComponents/Navigation.vue'

export default {
  data() { //选项 / 数据
    return {

    }
  },
  methods: { //事件处理器

  },
  components: { //定义组件
    'navv': navbar

  },
  created() { //生命周期函数
  }
}
</script>

<style>
.headImgBox {
  height: 650px;
  position: relative;
  width: 100%;
  background-size: cover;
  background-position: center 50%;
  background-repeat: no-repeat;
  margin-bottom: 90px;
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
