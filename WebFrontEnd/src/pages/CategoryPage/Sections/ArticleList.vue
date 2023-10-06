<script setup>
import {onMounted, ref} from "vue";

// material-input
import setMaterialInput from "../../../assets/js/material-input";
import CommonArticleCard from "../../Home/Components/CommonArticleCard.vue";
import {getAllArticleListByCategory} from "../../../api/index.js"
import {useRoute} from "vue-router";

const allArticleList = ref([])//所有文章
const category = ref()//所有文章
const route = useRoute()
const categoryInfo =
    {
      pageNum: 1,        // 页码数
      pageSize: 10,// 页大小
      categoryId: route.query.categoryId,
    }

onMounted(() => {
  getArticlesByType(categoryInfo)
})

async function getArticlesByType(config) {
  // var articleTypes = ["aaa", "bbb"];
  let articles = await getAllArticleListByCategory(config)
  console.log(articles.rows)

  allArticleList.value = articles
  category.value = articles.rows[0].categoryName
}

var publicHoverIndex = -1
onMounted(() => {
  setMaterialInput();
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
      <div class="container  mb-n7">
        <div class="col-auto" style="margin-bottom: 3rem;">
          <RouterLink :to="{ name: 'home' }">
            <span class="move-on-hover2 me-3 h4">首页</span>
          </RouterLink>
          <span class="h4 me-3 text-gray text-lighter">/</span>
          <span class="h4 me-4 text-gray">{{ category }}</span>
          <span>(</span>
          <span class="h6 me-1">{{ allArticleList.total }}</span>
          <span>篇文章)</span>
        </div>
        <div class="row">
          <div v-for="item in allArticleList.rows" class="col col-lg-4">
            <CommonArticleCard
                class="shadow-lg"
                :title="item.articleTitle"
                :subtitle='item.articleSummary'
                image="https://raw.githubusercontent.com/creativetimofficial/public-assets/master/material-design-system/presentation/pages/about-us.jpg"
                route="home"
                :views="item.views"
                :badgeColor="item.categoryBadgeColor"
                :category="item.categoryName"
            />
          </div>
        </div>
      </div>
  </section>
</template>
