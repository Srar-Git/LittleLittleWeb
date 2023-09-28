package cn.littlelittleweb.Domain.Entity.ArticleEntity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (Article)表实体类
 *
 * @author makejava
 * @since 2023-08-18 00:44:15
 */
@SuppressWarnings("serial")
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("web_article")
public class Article {
    //文章id
    @TableId
    private Integer id;
    //作者id
    private Integer userId;
    //分类名字
    @TableField(exist = false)
    private String categoryName;
    //分类ID
    private Integer categoryId;
    //缩略图
    private String articleCover;
    //文章标题
    private String articleTitle;
    //文章简介
    private String articleSummary;
    //文章内容
    private String articleContent;
    //类型 (1原创 2转载 3翻译)
    private Integer articleType;
    //是否置顶 (0否 1是）
    private Integer isTop;
    //是否已经被删除 (0否 1是)
    private Integer isDelete;
    //是否推荐 (0否 1是)
    private Integer isRecommend;
    //状态 (1公开 2私密 3评论可见)
    private Integer status;
    //查看数量
    private Integer views;
    //发表时间
    private Date createTime;
    //更新时间
    private Date updateTime;

}

