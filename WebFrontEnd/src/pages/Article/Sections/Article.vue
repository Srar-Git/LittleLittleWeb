<script setup xmlns="http://www.w3.org/1999/html">
import {onMounted, ref} from "vue";

// material-input
import setMaterialInput from "../../../assets/js/material-input";
import {getArticleDetail} from "../../../api/index.js"
import {useRoute} from "vue-router";

const articleInfo = ref([])//文章json
const articleDetail = ref()//文章
const route = useRoute()
const articleId = 2;
var a;

onMounted(() => {
  getArticle(articleId)
})

async function getArticle(id) {
  articleDetail.value = await getArticleDetail(id)
  console.log("hahaha "+ articleDetail.value.articleTitle)
  a = articleDetail.value
  console.log("hahaha2 "+ a.articleTitle)
  console.log("hahaha3 "+ route.query.id)
}



</script>

<script>
import Vue from "vue-markdown/dist/vue-markdown.js";

Vue.use(VueMarkdown);
var vm = new Vue({
  el: "body"
});
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


    <div class="container" v-if="articleDetail">

    </div>

  </section>
</template>
