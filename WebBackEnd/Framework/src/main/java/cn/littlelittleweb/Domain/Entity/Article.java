package cn.littlelittleweb.Domain.Entity;

import java.util.Date;

/**
 * (Article)表实体类
 *
 * @author makejava
 * @since 2023-08-18 00:44:15
 */
@SuppressWarnings("serial")
public class Article {
    //文章id
    private Integer id;
    //作者id
    private Integer userId;
    //分类id
    private Integer categoryId;
    //缩略图
    private String articleCover;
    //文章标题
    private String articleTitle;
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
    //发表时间
    private Date createTime;
    //更新时间
    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getArticleCover() {
        return articleCover;
    }

    public void setArticleCover(String articleCover) {
        this.articleCover = articleCover;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public Integer getArticleType() {
        return articleType;
    }

    public void setArticleType(Integer articleType) {
        this.articleType = articleType;
    }

    public Integer getIsTop() {
        return isTop;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}

