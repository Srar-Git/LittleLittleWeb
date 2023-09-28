<script setup>
import { onMounted } from "vue";

// tooltip
import setTooltip from "../../../assets/js/tooltip.js";

// store
import { useAppStore } from "../../../stores/index.js";
const store = useAppStore();

defineProps({
  route: {
    type: String,
    required: true,
  },
  author: {
    type: String,
    default: "",
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
  pro: {
    type: Boolean,
    default: true,
  },
});

</script>

<template>

  <section class="my-5 py-1">
    <div class="container">
      <div class="row align-items-start">
        <div class="col-lg-8 ms-auto me-auto p-lg-4 mt-lg-0 mt-4">
          <RouterLink :to="{ name: route }">
            <div
                class="move-on-hover"
                v-bind="$attrs"

            >
              <img
                  class="w-100 "
                  :class="pro "
                  :src="image"
                  :alt="title"
                  loading="lazy"
              />

            </div>

          </RouterLink>
        </div>
        <div class="col-lg-4 ">
          <div class="row mt-3">
            <!--    文章分类-->
            <h6 class="text-gray  font-weight-bolder">
              作者: &nbsp;{{author}} &nbsp; •  &nbsp;分类: &nbsp;{{ category }}
            </h6>

            <!--    文章标题-->
            <RouterLink :to="{ name: route }">
              <h2>
                {{ title }}
              </h2>
            </RouterLink>

<!--            文章副标题-->
            <h6 class="text-black-90  font-weight-normal">
              {{ subtitle }}
            </h6>

            <!--    文章时间-->

            <h6 class="text-gray text-secondary  font-weight-bolder ">
                {{ createYear }}年{{ createMonth }}月{{ createDay }}日&nbsp; • &nbsp; {{ views}} 查看
              </h6>

          </div>
        </div>
      </div>
    </div>
  </section>


  <div class="container">
    <div class="row">








    </div>
  </div>







</template>
