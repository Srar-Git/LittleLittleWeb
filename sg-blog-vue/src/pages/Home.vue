<!-- 首页 -->
<template>
    <div>
<!--      <header>-->
<!--        <navv style="z-index: 999"></navv>-->
<!--      </header>-->

          <sg-navbar></sg-navbar>


        <div class="container">
            <el-row  :gutter="30">
                <el-col :sm="24" :md="16" style="transition:all .5s ease-out;margin-bottom:30px;">
                    <sg-articlelist></sg-articlelist>
                </el-col>
                <el-col :sm="24"  :md="8" >
                    <sg-rightlist></sg-rightlist>
                </el-col>
            </el-row>
        </div>
    </div>
</template>

<script>
import header from '../components/header.vue'
import articlelist from '../components/articlelist.vue'
import rightlist from '../components/rightlist.vue'
import Nav from '../components/smallComponents/Navigation.vue'
    export default {
        name:'Home',
        data() { //选项 / 数据
            return {

            }
        },
        methods: { //事件处理器

        },
        components: { //定义组件
          'navv': Nav,
            'sg-navbar':header,
            'sg-articlelist':articlelist,
            'sg-rightlist':rightlist,

        },
        created() { //生命周期函数

        }
    }
</script>

<style>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

body {
  font-family: 'montserrat', sans-serif;
}

header {
  width: 100vw;
  background-color: #222;
  padding: 18px;
}
</style>
