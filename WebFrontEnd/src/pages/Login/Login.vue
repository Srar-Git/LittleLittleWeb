<script setup>
import { onMounted } from "vue";

// example components
import Navbar from "../../components/NavbarDefaulFixedForDark.vue";
import Header from "../Home/Sections/Header.vue";

//Vue Material Kit 2 components
import MaterialInput from "../../components/MaterialInput.vue";
import MaterialSwitch from "../../components/MaterialSwitch.vue";
import MaterialButton from "../../components/MaterialButton.vue";

// material-input
import setMaterialInput from "../../assets/js/material-input";
onMounted(() => {
  setMaterialInput();
});
</script>
<template>
  <div class="container">
    <Navbar transparent />
  </div>

  <Header>
    <div
        class="page-header align-items-start min-vh-100"
        :style="{
        backgroundImage:
          'url(https://images.unsplash.com/photo-1497294815431-9365093b7331?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1950&q=80)'
      }"
        loading="lazy"
    >
      <span class="mask bg-gradient-dark opacity-6"></span>
      <div class="container my-auto">
        <div class="row">
          <div class="col-lg-4 col-md-8 col-12 mx-auto">
            <div class="card z-index-0 fadeIn3 fadeInBottom">
              <div
                  class="card-header p-0 position-relative mt-n4 mx-3 z-index-2"
              >
                <div
                    class="bg-gradient-success shadow-success border-radius-lg py-3 pe-1"
                >
<!--                  <img src="../../assets/img/icon/logo.png" height="79.3" width="341" alt="">-->
                  <h3
                      class="text-white font-weight-bolder text-center mt-0 mb-0"
                  >
                    登    陆
                  </h3>

                </div>
              </div>
              <div class="card-body">
                <form role="form" class="text-start">
                  <MaterialInput
                      id="email"
                      class="input-group-outline my-3"
                      :label="{ text: '邮箱', class: 'form-label' }"
                      type="email"
                  />
                  <MaterialInput
                      id="password"
                      class="input-group-outline mb-3"
                      :label="{ text: '密码', class: 'form-label' }"
                      type="password"
                  />
                  <MaterialSwitch
                      class="d-flex align-items-center mb-3"
                      id="rememberMe"
                      labelClass="mb-0 ms-3"
                      checked
                  >记住密码</MaterialSwitch
                  >

                  <div class="text-center">
                    <MaterialButton
                        class="my-4 mb-2"
                        variant="gradient"
                        color="success"
                        fullWidth
                    >登陆</MaterialButton
                    >
                  </div>
                  <p class="mt-4 text-sm text-center">
                    没有账号?
                    <a
                        href="#"
                        class="text-success text-gradient font-weight-bold"
                    >请联系buptanlan@gmail.com申请</a
                    >
                  </p>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>

    </div>
  </Header>
</template>
