<script setup xmlns="http://www.w3.org/1999/html">
import {onMounted, ref} from "vue";

// material-input
import setMaterialInput from "../../../assets/js/material-input";
import {getArticleDetail} from "../../../api/index.js"
import {useRoute} from "vue-router";
import { mavonEditor } from 'mavon-editor'

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
  components: {
    Markdown
  },
  data() {
    return {
      source: '# Hello World!',
      breaks: true,
      markdownOptions: {
        html: true, // 启用 HTML 标签解析
        linkify: true, // 将 URL 自动转换为链接
        typographer: true, // 启用智能标点符号替换
        breaks: true
      }
    }
  }
}
</script>

<style>
*.move-on-hover2 {
  color: #595858;
}
*.move-on-hover2:hover {
  color: #8643f5;
}
</style>
<template>
  <section class="py-sm-6 py-4 position-relative">




    <div class="container  mb-n7" >
      <div class="col-auto" style="margin-bottom: 3rem;">
        <RouterLink :to="{ name: 'home' }">
          <span class="move-on-hover2 me-3 h4">首页</span>
        </RouterLink>
        <span class="h4 me-3 text-gray text-lighter">/</span>
        <RouterLink v-if="articleDetail" :to="{path:'/article/category',query: {categoryId: articleDetail.categoryId}}">
          <span class="move-on-hover2 me-3 h4" v-if="articleDetail">{{articleDetail.categoryName}}</span>
        </RouterLink>
        <span class="h4 me-3 text-gray text-lighter">/</span>
        <span class="h4 me-3 text-gray" v-if="articleDetail">{{articleDetail.articleTitle}}</span>
      </div>
    </div>


    <div class="container" v-if="articleDetail" style="margin-top: 10rem" v-html="aContent">

    </div>

  </section>
</template>
