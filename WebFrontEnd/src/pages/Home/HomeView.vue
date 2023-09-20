<script setup>
import { onMounted, onUnmounted } from "vue";

//example components
import NavbarDefault from "../Home/Sections/NavbarDefault.vue";
import Header from "../Home/Sections/Header.vue";

// sections
import PresentationPages from "./Sections/Articles.vue";

//images
import vueMkHeader from "../../assets/img/bg/bk.png";
import MaterialInput from "../../components/MaterialInput.vue";

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
      class="page-header min-vh-75"
      :style="`background-image: url(${vueMkHeader})`"
      loading="lazy"
    >
      <div class="container">
        <div class="row">
          <div class="col-lg-7 text-center mx-auto position-relative">
            <h1
              class="text-white pt-3 mt-n5 me-2"
              :style="{ display: 'inline-block ' }"
            >
              LittleLittle Web
            </h1>
<!--            <p class="lead text-white px-5 mt-4" :style="{ fontWeight: '500' }">-->
<!--              这里收录了一些小文章和小功能-->

<!--            </p>            <p class="lead text-white px-1 mt-3" :style="{ fontWeight: '500' }">-->
<!--            本站所有图像内容均由AI生成(logo除外).-->

<!--            </p>-->
          </div>
        </div>


      </div>
    </div>
  </Header>

  <div class="card card-body blur shadow-blur mx-3 mx-md-4 mt-n6">
    <PresentationPages />
  </div>
</template>
