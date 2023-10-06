<script setup>
import {onMounted, ref} from "vue";

//Vue Material Kit 2 components
import MaterialAvatar from "../../../components/MaterialAvatar.vue";
import MaterialButton from "../../../components/MaterialButton.vue";

// image
import profilePic from "../../../assets/img/bruce-mars.jpg";

// material-input
import setMaterialInput from "../../../assets/js/material-input";
import MaterialBadge from "../../../components/MaterialBadge.vue";
import CommonArticleCard from "../../Home/Components/CommonArticleCard.vue";
import {getAllArticleListByCategory, getAllTypes} from "../../../api/index.js"
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
  console.log("!11")
  getArticlesByType(categoryInfo)
})

async function getArticlesByType(config) {
  // var articleTypes = ["aaa", "bbb"];
  let articles = await getAllArticleListByCategory(config)
  console.log(articles.rows)

  allArticleList.value = articles
  category.value = articles.rows[0].categoryName
}

// const props = defineProps({
//   route: {
//     type: String,
//     required: true,
//   },
//   badgeColor: {
//     type: String,
//     default: "info"
//   },
//   category: {
//     type: String,
//     default: "未分类",
//   },
//   categoryId: {
//     type: Number,
//     default: 0,
//   },
//   description: {
//     type: String,
//     default: "该分类没有描述",
//   },
  // article: {
  //   id: {
  //     type: Number,
  //     required: true,
  //   },
  //   author: {
  //     type: String,
  //     default: ""
  //   },
  //   badgeColor: {
  //     type: String,
  //     default: "success"
  //   },
  //   image: {
  //     type: String,
  //     required: true,
  //   },
  //   title: {
  //     type: String,
  //     default: "",
  //   },
  //   category: {
  //     type: String,
  //     default: "未分类",
  //   },
  //   subtitle: {
  //     type: String,
  //     default: "",
  //   },
  //   createYear: {
  //     day: Number,
  //     default: 2017,
  //   },
  //   createMonth: {
  //     day: Number,
  //     default: 12,
  //   },
  //   createDay: {
  //     day: Number,
  //     default: 31,
  //   },
  //   views: {
  //     day: Number,
  //     default: 0,
  //   },
  // }
// });


onMounted(() => {
  setMaterialInput();
});
</script>


<template>
  <section class="py-sm-6 py-4 position-relative">
    <div class="container">
      <div class="col-auto" style="margin-top: 0rem;margin-left: 1.2rem;margin-right: 3rem">
        <RouterLink :to="{ name: 'home' }">
          <span class="h4 me-3 ">首页</span>
        </RouterLink>

        <span class="h4 me-3">/</span>
        <span class="h4">{{category}}</span>

      </div>
      <div class="row">
        <div class="col-12 ">
          <div class="mt-n9 mt-md-n6 ">
          </div>
          <div class="row py-5">

            <div
                class=""
            >

              <div
                  class="d-flex mb-2 " style="margin-right: 1px;margin-left: 1.3rem;margin-top: 1rem"
              >


<!--                <h2 class="mb-0 text-bolder">分类：{{ category }}</h2>-->
                <div class="col-auto" style="margin-top: 0rem;margin-left: 0rem;margin-right: 3rem">
                  <span class="h6 me-1">{{allArticleList.total}}</span>
                  <span>篇文章</span>
                </div>
              </div>
<!--              <p class=" h6" style="font-weight: inherit;margin-top: 2.1rem;margin-left: 1.3rem;margin-right: 3rem">-->
<!--                {{ description }}-->
<!--              </p>-->
            </div>
          </div>
        </div>
      </div>
      <div class="container  mb-n7">
        <div class="row">


<!--          <div class="col col-lg-4">-->
<!--            <CommonArticleCard-->
<!--                class="shadow-lg"-->
<!--                title="About Us Page"-->
<!--                subtitle="让我们来开始写文章吧！"-->
<!--                image="https://raw.githubusercontent.com/creativetimofficial/public-assets/master/material-design-system/presentation/pages/about-us.jpg"-->
<!--                route="home"-->
<!--            />-->
<!--          </div>-->

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
    </div>
  </section>
</template>
