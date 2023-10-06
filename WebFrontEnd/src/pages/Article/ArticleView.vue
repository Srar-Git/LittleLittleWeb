<script setup>
import { onMounted, onUnmounted } from "vue";

//example components
import NavbarDefault from "../Home/Components/NavbarDefault.vue";
import Header from "../Home/Sections/Header.vue";
import Profile from "./Sections/AuthorProfile.vue";

// sections
import PresentationPages from "./Sections/Articles.vue";

//images
import vueMkHeader from "../../assets/img/bg/966316.jpg";


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
      class="page-header min-vh-35"
      :style="`background-image: url(${vueMkHeader})`"
      loading="lazy"
    >
    </div>
  </Header>

  <div class="card card-body blur shadow-blur mx-3 mx-md-4 mt-n6 mb-4">
    <Profile />
  </div>

</template>
