<script setup>
import {RouterLink} from "vue-router";
import {ref, watch} from "vue";
import {useWindowsWidth} from "../../../assets/js/useWindowsWidth";
import MaterialInput from "../../../components/MaterialInput.vue";

// images
import ArrDark from "../../../assets/img/down-arrow-dark.svg";
import downArrow from "../../../assets/img/down-arrow.svg";
import DownArrWhite from "../../../assets/img/down-arrow-white.svg";

const props = defineProps({
  action: {
    type: Object,
    route: String,
    color: String,
    label: String,
    default: () => ({
      route: "https://github.com/AnLan1214090013/LittleLittleWeb",
      color: "bg-gradient-success",
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
<template>
  <nav
      class="navbar navbar-expand-lg top-0"
      :class="{
      'z-index-3 w-100 shadow-none navbar-transparent position-absolute my-3':
        props.transparent,
      'my-3 blur border-radius-lg z-index-3 py-2 shadow py-2 start-0 end-0 mx-4 position-absolute mt-4':
        props.sticky,
      'navbar-light bg-white py-3': props.light,
      ' navbar-dark bg-gradient-dark z-index-3 py-3': props.dark
    }"
  >
    <div
        :class="
        props.transparent || props.light || props.dark
          ? 'container'
          : 'container-fluid px-0'
      "
    >
      <RouterLink
          class="navbar-brand d-none d-md-block"
          :class="[
          (props.transparent && textDark.value) || !props.transparent
            ? 'text-dark font-weight-bolder ms-sm-3'
            : 'text-white font-weight-bolder ms-sm-3'
        ]"
          :to="{ name: 'home' }"
          rel="tooltip"
          title="Designed and Coded by Creative Tim"
          data-placement="bottom"
      >
        LittleLittle Web
      </RouterLink>


      <div class="input-group input-group-dynamic ms-sm-3 max-width-500">
<!--        <span class="input-group-text"><i class="fas fa-search" aria-hidden="true"></i></span>-->
<!--        <input class="form-control" placeholder="查找内容" type="text">-->
        <MaterialInput
            class="input-group-dynamic "
            icon="search"
            type="text"
            placeholder="查找内容我"
        />
      </div>


      <button class="btn btn-icon btn-2 btn-outline-primary w-9  py-lg-2 mx-2" type="button">
        <span class="btn-inner--icon"><i class="ni ni-button-play"></i></span>
        <span class="btn-inner--text">搜索</span>
      </button>


      <!--      article和github环节-->
      <div
          class="collapse navbar-collapse w-100 pt-3 pb-2 py-lg-0"
          id="navigation"
      >
        <ul class="navbar-nav navbar-nav-hover ms-auto">
          <li class="nav-item dropdown dropdown-hover mx-2">
            <a
                href="https://github.com/AnLan1214090013/LittleLittleWeb"
                class="nav-link d-flex cursor-pointer align-items-center"
            >
              <svg
                  width="20px"
                  height="20px"
                  class="material-icons me-2 opacity-6"
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
          </li>
        </ul>
        <ul class="navbar-nav d-lg-block d-none">
          <li class="nav-item">
            <a
                :href="action.route"
                class="btn btn-sm mb-0"
                :class="action.color"
                onclick="smoothToPricing('pricing-soft-ui')"
            >{{ action.label }}</a
            >
          </li>
        </ul>
      </div>
    </div>

  </nav>
  <!-- End Navbar -->
</template>
