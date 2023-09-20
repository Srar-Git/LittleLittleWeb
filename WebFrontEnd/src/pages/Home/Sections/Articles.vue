<script setup>
import ExampleCard from "./ExampleCard.vue";
import MaterialBadge from "./MaterialBadge.vue";

// images
import imgSigninCover from "../../../assets/img/signin-cover.png";
</script>
<template>
  <section class="py-5">
    <div class="container">
      <div class="row">
        <div class="row text-center my-sm-5 mt-5">
          <div class="col-lg-6 mx-auto">
<!--            <MaterialBadge color="success" class="mb-3"-->
<!--              >Boost creativity</MaterialBadge-->
<!--            >-->
            <h2 class="">欢迎来到我们的小站</h2>
            <p class="lead">
              The easiest way to get started is to use one of our <br />
              pre-built example pages.
            </p>
          </div>
        </div>
      </div>
    </div>
    <div class="container mt-5">
      <div class="row">
        <div class="col-md-8">
          <div class="row mt-4">
            <div class="col-md-6 mt-md-0 mt-5">
              <ExampleCard
                class="shadow-lg"
                title="About Us Page"
                image="https://raw.githubusercontent.com/creativetimofficial/public-assets/master/material-design-system/presentation/pages/about-us.jpg"
                route="home"
              />
            </div>
            <div class="col-md-6 mt-md-0 mt-5">
              <ExampleCard
                class="shadow-lg"
                title="Contact Us Page"
                image="https://raw.githubusercontent.com/creativetimofficial/public-assets/master/material-design-system/presentation/pages/contact.jpg"
                route="home"
              />
            </div>
          </div>
          <div class="row mt-4">
            <div class="col-md-6 mt-md-0 mt-5">
              <ExampleCard
                classes="mt-5"
                title="Sign In Page"
                :image="imgSigninCover"
                route="home"
              />
            </div>
            <div class="col-md-6 mt-md-0 mt-5">
              <ExampleCard
                classes="shadow-lg"
                title="Author Page"
                image="https://raw.githubusercontent.com/creativetimofficial/public-assets/master/material-design-system/presentation/pages/author.jpg"
                route="home"
              />
            </div>
          </div>
        </div>
        <div class="col-md-3 mx-auto mt-md-0 mt-3">
          <div class="position-sticky" style="top: 100px !important">
            <h3>
              Presentation Pages for Company, Landing Pages, Blogs and Support
            </h3>
            <h6 class="text-secondary font-weight-normal">
              These is just a small selection of the multiple possibitilies you
              have. Focus on the business, not on the design.
            </h6>
          </div>
        </div>
      </div>
    </div>
  </section>
</template>
