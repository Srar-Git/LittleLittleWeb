<script setup>
import { onMounted } from "vue";

// tooltip
import setTooltip from "../../../assets/js/tooltip.js";

// store
import { useAppStore } from "../../../stores/index.js";
import MaterialBadge from "../../../components/MaterialBadge.vue";
const store = useAppStore();

const props = defineProps({
  route: {
    type: String,
    required: true,
  },
  articleId: {
    type: Number
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
  pro: {
    type: Boolean,
    default: true,
  },
});

onMounted(() => {
  setTooltip(store.bootstrap);
});
</script>
<script>
export default {
  inheritAttrs: false,
};
</script>
<template>
  <RouterLink :to="{path:'/article/detail',query: {articleId: articleId}}">
    <div
      class="move-on-hover"
      v-bind="$attrs"
      :data-bs-toggle="pro ? 'tooltip' : null"
      :data-bs-placement="pro ? 'top' : null"
      :title="pro ? title : null"
    >
      <img
        class="w-100"
        :class="pro "
        :src="image"
        :alt="title"
        loading="lazy"
      />
    </div>
  </RouterLink>
<!--    文章分类-->
<!--    mt上下移动  ms左右移动-->
    <div class="ms-2 my-3">
      <p class="text-gray text-sm font-weight-bolder">
        作者: &nbsp;{{author}} &nbsp;
        <MaterialBadge variant="gradient" :color="''+props.badgeColor">
          {{category}}
        </MaterialBadge>
      </p>

    </div>

<!--    文章标题-->
  <RouterLink :to="{path:'/article/detail',query: {articleId: articleId}}">
    <div class="ms-2">
      <h4 >{{ title }}</h4>
      <p class="mt-3 text-black-90 text-sm font-weight-normal">
        {{ subtitle }}
      </p>
    </div>
    </RouterLink>

  <!--    文章时间-->
  <div class="ms-2">
    <p class="text-gray text-secondary text-sm font-weight-bolder ">
      {{ createYear }}年{{ createMonth }}月{{ createDay }}日&nbsp; • &nbsp; {{ views}} 查看
    </p>
  </div>
</template>
