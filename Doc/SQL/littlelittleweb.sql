-- ----------------------------
-- Table structure for web_article
-- Mysql5.7用这个
-- ----------------------------
DROP TABLE IF EXISTS `web_article`;
CREATE TABLE `web_article`  (
                                `id` int NOT NULL AUTO_INCREMENT COMMENT '文章id',
                                `user_id` int NOT NULL COMMENT '作者id',
                                `category_id` int NOT NULL COMMENT '分类id',
                                `article_cover` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '缩略图',
                                `article_title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '文章标题',
                                `article_content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '文章内容',
                                `article_summary` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '文章简介',
                                `article_type` tinyint(1) NOT NULL DEFAULT 1 COMMENT '类型 (1原创 2转载 3翻译)',
                                `is_top` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否置顶 (0否 1是）',
                                `is_delete` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否已经被删除 (0否 1是)',
                                `is_recommend` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否推荐 (0否 1是)',
                                `status` tinyint(1) NOT NULL DEFAULT 1 COMMENT '状态 (1公开 2私密 3评论可见)',
                                `views` int NOT NULL DEFAULT 0 COMMENT '查看数量',
                                `create_time` datetime NOT NULL COMMENT '发表时间',
                                `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
                                PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Mysql8版本用这个
-- ----------------------------
-- DROP TABLE IF EXISTS `web_article`;
-- CREATE TABLE `web_article`  (
--                                `id` int NOT NULL AUTO_INCREMENT COMMENT '文章id',
--                                `user_id` int NOT NULL COMMENT '作者id',
--                                `category_id` int NOT NULL COMMENT '分类id',
--                                `article_cover` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '缩略图',
--                                `article_title` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '文章标题',
--                                `article_content` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '文章内容',
--                                `article_summary` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '文章简介',
--                                `article_type` tinyint(1) NOT NULL DEFAULT 1 COMMENT '类型 (1原创 2转载 3翻译)',
--                                `is_top` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否置顶 (0否 1是）',
--                                `is_delete` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否已经被删除 (0否 1是)',
--                                `is_recommend` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否推荐 (0否 1是)',
--                                `status` tinyint(1) NOT NULL DEFAULT 1 COMMENT '状态 (1公开 2私密 3评论可见)',
--                                `views` int NOT NULL DEFAULT 0 COMMENT '查看数量',
--                                `create_time` datetime NOT NULL COMMENT '发表时间',
--                                `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
--                                PRIMARY KEY (`id`) USING BTREE
-- ) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for web_category
-- mysql 5.7
-- ----------------------------
DROP TABLE IF EXISTS `web_category`;
CREATE TABLE `web_category`  (
                               `id` int NOT NULL AUTO_INCREMENT COMMENT '分类id',
                               `category_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '分类名',
                               `category_badge_color` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '分类徽章颜色',
                               `create_time` datetime NOT NULL COMMENT '创建时间',
                               PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Mysql8版本用这个
-- ----------------------------
-- DROP TABLE IF EXISTS `web_category`;
-- CREATE TABLE `web_category`  (
--                                `id` int NOT NULL AUTO_INCREMENT COMMENT '分类id',
--                                `category_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '分类名',
--                                `category_badge_color` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '分类徽章颜色',
--                                `create_time` datetime NOT NULL COMMENT '创建时间',
--                                PRIMARY KEY (`id`) USING BTREE
-- ) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for web_user
-- mysql 5.7
-- ----------------------------
DROP TABLE IF EXISTS `web_user`;
CREATE TABLE `web_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(64) NOT NULL CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT 'NULL' COMMENT '用户名',
  `nick_name` varchar(64) NOT NULL CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT 'NULL' COMMENT '昵称',
  `password` varchar(64) NOT NULL CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT 'NULL' COMMENT '密码',
  `type` char(1) DEFAULT '0' COMMENT '用户类型：0代表普通用户，1代表管理员',
  `status` char(1) DEFAULT '0' COMMENT '账号状态（0正常 1停用）',
  `email` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '邮箱',
  `phonenumber` varchar(32) DEFAULT NULL COMMENT '手机号',
  `sex` char(1) DEFAULT NULL COMMENT '用户性别（0男，1女，2未知）',
  `avatar` varchar(128) DEFAULT NULL COMMENT '头像',
  `create_by` bigint(20) DEFAULT NULL COMMENT '创建人的用户id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` bigint(20) DEFAULT NULL COMMENT '更新人',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `del_flag` int(11) DEFAULT '0' COMMENT '删除标志（0代表未删除，1代表已删除）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC COMMENT='用户表';

-- ----------------------------
-- Mysql8版本用这个
-- ----------------------------
-- DROP TABLE IF EXISTS `web_user`;
-- CREATE TABLE `web_user` (
--   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
--   `user_name` varchar(64) NOT NULL CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT 'NULL' COMMENT '用户名',
--   `nick_name` varchar(64) NOT NULL CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT 'NULL' COMMENT '昵称',
--   `password` varchar(64) NOT NULL CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT 'NULL' COMMENT '密码',
--   `type` char(1) DEFAULT '0' COMMENT '用户类型：0代表普通用户，1代表管理员',
--   `status` char(1) DEFAULT '0' COMMENT '账号状态（0正常 1停用）',
--   `email` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '邮箱',
--   `phonenumber` varchar(32) DEFAULT NULL COMMENT '手机号',
--   `sex` char(1) DEFAULT NULL COMMENT '用户性别（0男，1女，2未知）',
--   `avatar` varchar(128) DEFAULT NULL COMMENT '头像',
--   `create_by` bigint(20) DEFAULT NULL COMMENT '创建人的用户id',
--   `create_time` datetime DEFAULT NULL COMMENT '创建时间',
--   `update_by` bigint(20) DEFAULT NULL COMMENT '更新人',
--   `update_time` datetime DEFAULT NULL COMMENT '更新时间',
--   `del_flag` int(11) DEFAULT '0' COMMENT '删除标志（0代表未删除，1代表已删除）',
--   PRIMARY KEY (`id`)
-- ) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT='用户表' ROW_FORMAT = DYNAMIC;