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
import {getAllTypes} from "../../../api/index.js"
const allArticleList = ref([])//所有文章
onMounted(() => {
  getArticleTypes()
})

const props = defineProps({
  route: {
    type: String,
    required: true,
  },
  badgeColor: {
    type: String,
    default: "info"
  },
  category: {
    type: String,
    default: "未分类",
  },
  categoryId: {
    type: Number,
    default: 0,
  },
  description: {
    type: String,
    default: "该分类没有描述",
  },
  article: {
    route: {
      type: String,
      required: true,
    },
    author: {
      type: String,
      default: ""
    },
    badgeColor: {
      type: String,
      default: "success"
    },
    image: {
      type: String,
      required: true,
    },
    title: {
      type: String,
      default: "",
    },
    category: {
      type: String,
      default: "未分类",
    },
    subtitle: {
      type: String,
      default: "",
    },
    createYear: {
      day: Number,
      default: 2017,
    },
    createMonth: {
      day: Number,
      default: 12,
    },
    createDay: {
      day: Number,
      default: 31,
    },
    views: {
      day: Number,
      default: 0,
    },
  }
});


onMounted(() => {
  setMaterialInput();
});
</script>
<template>
  <section class="py-sm-6 py-4 position-relative">
    <div class="container">
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
                <h1 class="mb-0 text-bolder">分类：{{category}}</h1>
                <div class="col-auto" style="margin-top: 2.1rem;margin-left: 2rem;margin-right: 3rem">
                  <span class="h6 me-1">323</span>
                  <span>篇文章</span>
                </div>
              </div>
              <p class=" h6" style="font-weight: inherit;margin-top: 2.1rem;margin-left: 1.3rem;margin-right: 3rem">
                {{description}}
              </p>
            </div>
          </div>
        </div>
      </div>
      <div class="container  mb-n7" >
        <div class="row">


          <div class="col col-lg-4">
            <CommonArticleCard
                class="shadow-lg"
                title="About Us Page"
                subtitle="让我们来开始写文章吧！"
                image="https://raw.githubusercontent.com/creativetimofficial/public-assets/master/material-design-system/presentation/pages/about-us.jpg"
                route="home"
            />
          </div>

          <div class="col col-lg-4">
            <CommonArticleCard
                v-for=""
                class="shadow-lg"
                title="About Us Page"
                subtitle="让我们来开始写文章吧！"
                image="https://raw.githubusercontent.com/creativetimofficial/public-assets/master/material-design-system/presentation/pages/about-us.jpg"
                route="home"
            />
          </div>

        </div>
      </div>
    </div>
  </section>
</template>
