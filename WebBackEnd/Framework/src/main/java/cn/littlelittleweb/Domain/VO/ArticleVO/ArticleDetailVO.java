package cn.littlelittleweb.Domain.VO.ArticleVO;


import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ArticleDetailVO {
    //文章id
    @TableId
    private Integer id;
    //作者id
    private Integer userId;
    //分类名字
    private String categoryName;
    //分类颜色
    private String categoryBadgeColor;
    //分类ID
    private Integer categoryId;
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
