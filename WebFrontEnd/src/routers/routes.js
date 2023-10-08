
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
    path: '/login',
    component: () => import('../pages/Login/Login.vue'),

    name: 'login'
  }, //注册登录
];
