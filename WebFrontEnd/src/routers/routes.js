
export const staticRoutes = [
  {
    path: "/",
    name: "home",
    component: () => import("../pages/Home/HomeView.vue"),
  },
  {
    path: "/article/category",
    name: "category",
    component: () => import("../pages/CategoryPage/ArticleCategoryView.vue"),
  },
  {
    path: "/article/detail",
    name: "detail",
    component: () => import("../pages/Article/ArticleView.vue"),
  },
  {
    // 头条
    path: "/headlinenews",
    component: () => import("../pages/HeadlineNews/index.vue"),
    name: "HeadlineNews",
  },
  // {
  //   //头条详情
  //   path: "/detail",
  //   component: () => import("../pages/Detail/index.vue"),
  //   name: "Detail",
  // },
  {
    // 登录
    path: "/login",
    component: () => import("../pages/Login/index.vue"),
    name: "Login",
  },
  {
    //注册
    path: "/register",
    component: () => import("../pages/Register/index.vue"),
    name: "Register",
  },
   {
    //发布新闻的页面
    path: "/addormodifynews",
    component: () => import("../pages/addOrModifyNews/index.vue"),
    name: "addOrModifyNews",
  },
];
