<script setup>
import {onMounted, onUnmounted, watch} from "vue";
import { useRoute } from 'vue-router'
//example components
import NavbarDefault from "../../components/NavbarDefault.vue";
import Header from "../Home/Sections/Header.vue";
import ArticleList from "./Sections/ArticleList.vue";

// sections
import PresentationPages from "./Sections/Articles.vue";

//images
import vueMkHeader from "../../assets/img/bg/966316.jpg";
import logo from "../../assets/img/icon/logo.png";


//hooks
const body = document.getElementsByTagName("body")[0];
onMounted(() => {
  body.classList.add("presentation-page");
  body.classList.add("bg-gray-200");
});
onUnmounted(() => {
  body.classList.remove("presentation-page");
  body.classList.remove("bg-gray-200");
});
const route = useRoute()
watch(route, (newValue, oldValue) => {
  console.log('watch 已触发', newValue, oldValue)
  // 执行onMounted代码
  location.reload()
})
</script>

<template>
  <div class="container position-sticky z-index-sticky top-0">
    <div class="row">
      <div class="col-12">
        <NavbarDefault :sticky="true" />
      </div>
    </div>
  </div>
  <Header>
    <div
      class="page-header min-vh-35"
      :style="`background-image: url(${vueMkHeader})`"
      loading="lazy"
    >
    </div>
  </Header>



  <div class="card card-body blur shadow-blur mx-3 mx-md-4 mt-n6 mb-4">
    <div class="mt-n8 mt-md-n7 text-center">
      <img src="../../assets/img/icon/LLW.png" height="142" width="341" alt="">
    </div>
    <ArticleList />
  </div>

</template>
