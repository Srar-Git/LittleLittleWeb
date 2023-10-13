<script setup>
import {RouterLink, useRoute} from "vue-router";
import {ref, onMounted, getCurrentInstance, watch, onUpdated} from "vue"
import {useWindowsWidth} from "../assets/js/useWindowsWidth.js";
import MaterialInput from "./MaterialInput.vue";
import {getAllTypes} from "../api/index.js"

// images
import ArrDark from "../assets/img/down-arrow-dark.svg";
import downArrow from "../assets/img/down-arrow.svg";
import DownArrWhite from "../assets/img/down-arrow-white.svg";

onMounted(() => {
  getArticleTypes()
})
const allTypeList = ref([])//所有文章分类
const props = defineProps({
  action: {
    type: Object,
    route: String,
    color: String,
    label: String,
    default: () => ({
      route: "/Login",
      color: "bg-gradient-primary",
      label: "登陆"
    })
  },
  transparent: {
    type: Boolean,
    default: false
  },
  light: {
    type: Boolean,
    default: false
  },
  dark: {
    type: Boolean,
    default: false
  },
  sticky: {
    type: Boolean,
    default: false
  },
  darkText: {
    type: Boolean,
    default: false
  }
});

// set arrow  color
function getArrowColor() {
  if (props.transparent && textDark.value) {
    return ArrDark;
  } else if (props.transparent) {
    return DownArrWhite;
  } else {
    return ArrDark;
  }
}

async function getArticleTypes() {
  // var articleTypes = ["aaa", "bbb"];
  let articleTypes = await getAllTypes()
  articleTypes.forEach((item) => {
    item.id = item.id
    item.categoryName = item.categoryName
    item.categoryBadgeColor = item.categoryBadgeColor
  })

  allTypeList.value = articleTypes
}

// set text color
const getTextColor = () => {
  let color;
  if (props.transparent && textDark.value) {
    color = "text-dark";
  } else if (props.transparent) {
    color = "text-white";
  } else {
    color = "text-dark";
  }

  return color;
};

// set nav color on mobile && desktop

let textDark = ref(props.darkText);
const {type} = useWindowsWidth();

if (type.value === "mobile") {
  textDark.value = true;
} else if (type.value === "desktop" && textDark.value == false) {
  textDark.value = false;
}

watch(
    () => type.value,
    (newValue) => {
      if (newValue === "mobile") {
        textDark.value = true;
      } else {
        textDark.value = false;
      }
    }
);
</script>

<style>
.grid-container {
  display: grid;
  grid-template-columns: 2fr 1fr 18fr 10fr;
  grid-gap: 1%;
  justify-content: center;
}

.grid-dropdown-container {
  display: grid;
  grid-template-columns: 27% 22% 16%;
  justify-content: end;
  justify-items: end;
}
</style>

<template>
  <nav class="navbar navbar-expand-lg z-index-3 shadow-none navbar-transparent position-absolute  "
       style="top: 0.5%;width: 89%;">

    <div class="grid-container ">
      <div class=" " style="">
        <RouterLink :to="{ name: 'home' }">
          <img src="../assets/img/icon/LLW.png" width="170.5" height="71">
        </RouterLink>
      </div>
      <div class=" " style="" id="search-btn">
        <svg t="1695213574640"
             style="margin-top: 60%;margin-left: 50%"
             class="material-icons opacity-8"
             viewBox="0 0 1024 1024"
             xmlns="http://www.w3.org/2000/svg"
             p-id="4003"
             width="24px"
             height="24px"
        >
          <path
              d="M448 85.333333a362.666667 362.666667 0 0 1 284.842667 587.178667l193.28 193.28a42.666667 42.666667 0 0 1-60.288 60.373333l-193.365334-193.28A362.666667 362.666667 0 1 1 448 85.333333z m0 85.333334a277.333333 277.333333 0 1 0 0 554.666666 277.333333 277.333333 0 0 0 0-554.666666z"
              fill="#ffffff" p-id="4004"
          >

          </path>
        </svg>
      </div>
      <div style="" class="container " id="search-input">
        <MaterialInput
            class="input-group-dynamic text-white"
            style="margin-top: 1.7%;left: -4%"
            icon="search"
            type="text"
            placeholder="在LittleLittleWeb中查找内容"
        />
      </div>
      <div class="  " id="navigation" style="">
        <div class="grid-dropdown-container " style="margin-top: 5%">
          <div class="nav-item dropdown dropdown-hover " style=";width: 100%">
            <a
                role="button"
                class="nav-link d-flex  "
                :class="getTextColor()"
                id="dropdownMenuBlocks"
                data-bs-toggle="dropdown"
                aria-expanded="false"
            >
              <!--              <svg t="1695717023504" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="947" width="200" height="200"><path d="M337.249467 51.393074H80.69503c-43.842968 0-80.451847 36.608879-80.451847 87.759009v255.896792c0 43.842968 36.608879 80.378776 80.451847 80.378776h256.554437c51.296273 0 80.59799-36.535807 80.59799-80.378776V139.152083c7.307161-51.15013-36.608879-87.759009-80.59799-87.759009z m659.398245 153.596533L820.837409 22.164428c-29.301717-29.228646-87.905152-29.228646-117.279941 0L520.366932 204.989607c-29.301717 29.228646-29.301717 87.685937 0 116.914583l175.956446 182.752106c29.301717 29.228646 87.905152 29.228646 117.206869 0l175.883376-182.752106c43.91604-29.228646 43.91604-87.685937 7.234089-116.914583zM337.249467 599.722466H80.69503c-43.842968 0-80.451847 36.535807-80.451847 87.759009v255.823721A81.109492 81.109492 0 0 0 80.69503 1023.757043h256.554437c51.296273 0 80.59799-36.535807 80.59799-80.451847V687.481475c7.307161-51.223201-36.608879-87.759009-80.59799-87.759009z m549.498538 0H637.646872c-51.296273 0-80.59799 36.535807-80.59799 80.451847v255.823721C549.741721 987.221236 586.350599 1023.757043 637.646872 1023.757043h256.481366c51.223201 0 80.59799-36.535807 80.59799-80.451847V687.481475c0-51.223201-36.608879-87.759009-87.978223-87.759009z" p-id="948"></path></svg>-->
              <svg
                  class="material-icons  opacity-9 nav-item dropdown dropdown-hover me-1"
                  style="top: 2px"
                  viewBox="0 0 1024 1024"
                  xmlns="http://www.w3.org/2000/svg"
                  p-id="4003"
                  width="16px"
                  height="16px"
              >
                <path
                    d="M337.249467 51.393074H80.69503c-43.842968 0-80.451847 36.608879-80.451847 87.759009v255.896792c0 43.842968 36.608879 80.378776 80.451847 80.378776h256.554437c51.296273 0 80.59799-36.535807 80.59799-80.378776V139.152083c7.307161-51.15013-36.608879-87.759009-80.59799-87.759009z m659.398245 153.596533L820.837409 22.164428c-29.301717-29.228646-87.905152-29.228646-117.279941 0L520.366932 204.989607c-29.301717 29.228646-29.301717 87.685937 0 116.914583l175.956446 182.752106c29.301717 29.228646 87.905152 29.228646 117.206869 0l175.883376-182.752106c43.91604-29.228646 43.91604-87.685937 7.234089-116.914583zM337.249467 599.722466H80.69503c-43.842968 0-80.451847 36.535807-80.451847 87.759009v255.823721A81.109492 81.109492 0 0 0 80.69503 1023.757043h256.554437c51.296273 0 80.59799-36.535807 80.59799-80.451847V687.481475c7.307161-51.223201-36.608879-87.759009-80.59799-87.759009z m549.498538 0H637.646872c-51.296273 0-80.59799 36.535807-80.59799 80.451847v255.823721C549.741721 987.221236 586.350599 1023.757043 637.646872 1023.757043h256.481366c51.223201 0 80.59799-36.535807 80.59799-80.451847V687.481475c0-51.223201-36.608879-87.759009-87.978223-87.759009z"
                    p-id="948" fill="#ffffff"></path>
              </svg>
              文章
              <img
                  :src="getArrowColor()"
                  alt="down-arrow"
                  class="arrow ms-2 d-lg-block d-none"
              />
              <img
                  :src="getArrowColor()"
                  alt="down-arrow"
                  class="arrow ms-1 d-lg-none d-block ms-auto"
              />
            </a>
            <div
                class="dropdown-menu dropdown-menu-end dropdown-menu-animation dropdown-md dropdown-md-responsive p-3 border-radius-lg mt-0 mt-lg-3"
                aria-labelledby="dropdownMenuBlocks"
            >
              <div class="d-none d-lg-block">
                <ul class="list-group">
                  <li
                      class="nav-item dropdown dropdown-hover dropdown-subitem list-group-item border-0 p-0"
                  >
                    <a
                        class="dropdown-item py-2 ps-3 border-radius-md"
                        href="javascript:;"
                    >
                      <div class="d-flex">
                        <div
                            class="w-100 d-flex align-items-center justify-content-between"
                        >
                          <div>
                            <h6
                                class="dropdown-header text-dark font-weight-bolder d-flex justify-content-cente align-items-center p-0"
                            >
                              文章分类
                            </h6>
                            <span class="text-sm">查看所有分类的文章</span>
                          </div>
                          <img
                              :src="downArrow"
                              alt="down-arrow"
                              class="arrow"
                          />
                        </div>
                      </div>
                    </a>
                    <div class="dropdown-menu mt-0 py-3 px-2 mt-3">
                      <RouterLink
                          class="dropdown-item ps-3 border-radius-md mb-1"
                          :to="{ name: 'home' }"
                      >
                        所有文章(发布时间排序)
                      </RouterLink>
                      <RouterLink v-for="item in allTypeList" :key="item.categoryName"
                                  class="dropdown-item ps-3 border-radius-md mb-1"
                                  :to="{path:'/article/category',query: {categoryId: item.id}}"

                      >
                        {{ item.categoryName }}
                      </RouterLink>


                    </div>
                  </li>
                  <li
                      class="nav-item dropdown dropdown-hover dropdown-subitem list-group-item border-0 p-0"
                  >
                    <a
                        class="dropdown-item py-2 ps-3 border-radius-md"
                        href="javascript:;"
                    >
                      <div class="d-flex">
                        <div
                            class="w-100 d-flex align-items-center justify-content-between"
                        >
                          <div>
                            <h6
                                class="dropdown-header text-dark font-weight-bolder d-flex justify-content-cente align-items-center p-0"
                            >
                              文章排序
                            </h6>
                            <span class="text-sm">按照不同的排序查看文章</span>
                          </div>
                          <img
                              :src="downArrow"
                              alt="down-arrow"
                              class="arrow"
                          />
                        </div>
                      </div>
                    </a>
                    <div class="dropdown-menu mt-0 py-3 px-2 mt-3">
                      <RouterLink
                          class="dropdown-item ps-3 border-radius-md mb-1"
                          :to="{ name: 'home' }"
                      >
                        按照浏览数量查看
                      </RouterLink>
                      <RouterLink
                          class="dropdown-item ps-3 border-radius-md mb-1"
                          :to="{ name: 'home' }"
                      >
                        按照发布时间查看
                      </RouterLink>
                      <RouterLink
                          class="dropdown-item ps-3 border-radius-md mb-1"
                          :to="{ name: 'home' }"
                      >
                        按照更新时间查看
                      </RouterLink>
                    </div>
                  </li>

                </ul>
              </div>
            </div>
          </div>
          <div class="align-items-end " style="">
            <a
                href="https://github.com/AnLan1214090013/LittleLittleWeb"
                class="nav-link d-flex cursor-pointer align-items-center"
            >
              <svg
                  width="20px"

                  height="20px"
                  class="material-icons me-1 opacity-9 "
                  viewBox="0 0 24 24"
                  aria-hidden="true"
                  data-testid="GitHubIcon"
                  :fill="props.transparent && '#fff'"
              >
                <path
                    d="M12 1.27a11 11 0 00-3.48 21.46c.55.09.73-.28.73-.55v-1.84c-3.03.64-3.67-1.46-3.67-1.46-.55-1.29-1.28-1.65-1.28-1.65-.92-.65.1-.65.1-.65 1.1 0 1.73 1.1 1.73 1.1.92 1.65 2.57 1.2 3.21.92a2 2 0 01.64-1.47c-2.47-.27-5.04-1.19-5.04-5.5 0-1.1.46-2.1 1.2-2.84a3.76 3.76 0 010-2.93s.91-.28 3.11 1.1c1.8-.49 3.7-.49 5.5 0 2.1-1.38 3.02-1.1 3.02-1.1a3.76 3.76 0 010 2.93c.83.74 1.2 1.74 1.2 2.94 0 4.21-2.57 5.13-5.04 5.4.45.37.82.92.82 2.02v3.03c0 .27.1.64.73.55A11 11 0 0012 1.27"
                ></path>
              </svg>
              Github
            </a>
          </div>
          <div class="align-items-end" style="">
            <div style=";">

              <a
                  :href="action.route"
                  class="btn btn-sm mb-0 "
                  style="left: 25%;"
                  :class="action.color"
                  onclick="smoothToPricing('pricing-soft-ui')"
              >{{ action.label }}</a
              >
            </div>
          </div>
        </div>
      </div>
    </div>


    <!--      article和github环节-->


  </nav>
  <!-- End Navbar -->
</template>
