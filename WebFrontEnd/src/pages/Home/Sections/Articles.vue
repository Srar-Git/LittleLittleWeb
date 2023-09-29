<script setup>
import ExampleCard from "../Components/CommonArticleCard.vue";
import MaterialBadge from "../Components/MaterialBadge.vue";

// images
import imgSigninCover from "../../../assets/img/signin-cover.png";
import FirstArticleCard from "../Components/FirstArticleCard.vue";
import CommonArticleCard from "../Components/CommonArticleCard.vue";
</script>
<template>


  <FirstArticleCard
      author="Srar"
      class="shadow-lg"
      title="P4实现Srv6——INT"
      subtitle="让我们来开始写文章吧！"
      image="https://raw.githubusercontent.com/creativetimofficial/public-assets/master/material-design-system/presentation/pages/about-us.jpg"
      route="home"
      category="SDN"
  />

  <div class="container">
    <div class="row">


      <div class="col col-lg-4">
        <CommonArticleCard
            class="shadow-lg"
            title="About Us Page"
            subtitle="让我们来开始写文章吧！"
            image="https://raw.githubusercontent.com/creativetimofficial/public-assets/master/material-design-system/presentation/pages/about-us.jpg"
            route="home"
        />
      </div>
      <div class="col col-lg-4">
        <CommonArticleCard
            class="shadow-lg"
            title="Contact Us Page"
            image="https://raw.githubusercontent.com/creativetimofficial/public-assets/master/material-design-system/presentation/pages/contact.jpg"
            route="home"
        />
      </div>
      <div class="col col-lg-4">
        <CommonArticleCard
            class="shadow-lg"
            title="Sign In Page"
            image="https://raw.githubusercontent.com/creativetimofficial/public-assets/master/material-design-system/presentation/pages/contact.jpg"
            route="home"
        />
      </div>
      <div class="col col-lg-4">
        <CommonArticleCard
            class="shadow-lg"
            title="Author Page"
            image="https://raw.githubusercontent.com/creativetimofficial/public-assets/master/material-design-system/presentation/pages/author.jpg"
            route="home"
        />
      </div>
    </div>
  </div>

</template>
