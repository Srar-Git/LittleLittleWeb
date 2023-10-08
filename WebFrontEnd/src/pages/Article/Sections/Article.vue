<script setup xmlns="http://www.w3.org/1999/html">
import {onMounted, ref} from "vue";

// material-input
import setMaterialInput from "../../../assets/js/material-input";
import {getArticleDetail} from "../../../api/index.js"
import {useRoute} from "vue-router";
import { mavonEditor } from 'mavon-editor'
import MDEditor from "../Components/MDEditor.vue";

const aContent = ref()//文章内容
const articleDetail = ref()//文章
const route = useRoute()
const inputArticleInfo =
    {
      articleId: route.query.articleId,
    }

onMounted(() => {
  getArticle(inputArticleInfo)
})

async function getArticle(info) {
  articleDetail.value = await getArticleDetail(info)
  const markdownIt = mavonEditor.getMarkdownIt()
  console.log(articleDetail.value.articleContent)
  aContent.value = markdownIt.render(articleDetail.value.articleContent);


}



</script>

<script>
import Markdown from 'vue3-markdown-it';

export default {
  name: 'MDEditor',
  data() {
    return {
      context: '', // 输入的数据
      toolbars: {
        bold: true, // 粗体
        italic: true, // 斜体
        header: true, // 标题
        underline: true, // 下划线
        strikethrough: true, // 中划线
        mark: true, // 标记
        superscript: true, // 上角标
        subscript: true, // 下角标
        quote: true, // 引用
        ol: true, // 有序列表
        ul: true, // 无序列表
        link: true, // 链接
        imagelink: true, // 图片链接
        code: true, // code
        table: true, // 表格
        fullscreen: true, // 全屏编辑
        readmodel: true, // 沉浸式阅读
        htmlcode: true, // 展示html源码
        help: true, // 帮助
        undo: true, // 上一步
        redo: true, // 下一步
        trash: true, // 清空
        save: true, // 保存（触发events中的save事件）
        navigation: true, // 导航目录
        alignleft: true, // 左对齐
        aligncenter: true, // 居中
        alignright: true, // 右对齐
        subfield: true, // 单双栏模式
        preview: true // 预览
      },
    }
  },
  mounted() {
  },
  methods: {}
}



</script>

<style>
*.move-on-hover2 {
  color: #515762;
  font-weight: normal;
}
*.move-on-hover2:hover {
  color: #8643f5;
  font-weight: normal;
}
.header-article{
  background-color: #f6f8fc;
  padding-left: 6rem;
  padding-bottom: 15px;
  padding-top: 15px;
}
.mulu{
  height: 40px;
  color: #bcc1ca;
  background-color: white;
  border: 1px solid #e8e9eb;
  padding-left: 10px;
  padding-top: 6px;
}
</style>
<template>
  <section >




    <div class="header-article align-items-center" >
      <div class="col-auto " >
        <RouterLink :to="{ name: 'home' }">
          <span class="move-on-hover2 me-3 h5 ">首页</span>
        </RouterLink>
        <span class="h5 me-3 text-gray text-lighter">/</span>
        <RouterLink v-if="articleDetail"  :to="{path:'/article/category',query: {categoryId: articleDetail.categoryId}}">
          <span class="move-on-hover2 me-3 h5" v-if="articleDetail" >{{articleDetail.categoryName}}</span>
        </RouterLink>
        <span class="h5 me-3 text-gray text-lighter">/</span>
        <span class="h5 me-3 text-gray" v-if="articleDetail">{{articleDetail.articleTitle}}</span>
      </div>
    </div>

  <div class="container" style="margin-top: 3rem">
    <div class="row" >
      <div class="col-3 me-4">
        <div class="position-sticky mulu"  v-if="articleDetail"  style="top: 30px !important;" >目录 (点击跳转)</div>
      </div>
      <div class="card card-body blur shadow-secondary col-7" v-if="articleDetail" >a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br><br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>br>a<br>a<br>asda<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a<br>a</div>
    </div>


  </div>
  </section>
</template>
