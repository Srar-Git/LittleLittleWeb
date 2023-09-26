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
-- Table structure for t_category
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