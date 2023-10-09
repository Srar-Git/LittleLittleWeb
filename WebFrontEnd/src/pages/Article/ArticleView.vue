<script setup xmlns="http://www.w3.org/1999/html">
import {onMounted, onUnmounted, watch} from "vue";
import {useRoute} from 'vue-router'
//example components
import Navbar from "../../components/NavbarDefaulFixedForDark.vue";
import Header from "../Home/Sections/Header.vue";
import Article from "./Sections/Article.vue";


//images
import vueMkHeader from "../../assets/img/bg/966316.jpg";
import logo from "../../assets/img/icon/logo.png";

//hooks
const body = document.getElementsByTagName("body")[0];
onMounted(() => {
  body.classList.add("presentation-page");
  body.classList.add("bg-white");
});
onUnmounted(() => {
  body.classList.remove("presentation-page");
  body.classList.remove("bg-gray-200");
});
const route = useRoute()
watch(route, (newValue, oldValue) => {
  location.reload()
})
</script>

<style>
.header-a{
  background-color: #8643f5;
  padding-bottom: 4rem;
  padding-top: 3rem;
}
</style>

<template>
  <div class="header-a"></div>
  <div class="container">
      <div class="col-5 ">
        <Navbar transparent/>
      </div>
  </div>


  <Article/>


</template>
