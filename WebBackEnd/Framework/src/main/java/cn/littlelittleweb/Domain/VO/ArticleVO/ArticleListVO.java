package cn.littlelittleweb.Domain.VO.ArticleVO;


import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ArticleListVO {
    //文章id
    @TableId
    private Integer id;
    //作者id
    private Integer userId;
    //分类id
    private Integer categoryId;
    //分类名字
    private String categoryName;
    //缩略图
    private String articleCover;
    //文章标题
    private String articleTitle;
    //文章简介
    private String articleSummary;
    //类型 (1原创 2转载 3翻译)
    private Integer articleType;
    //查看数量
    private Integer views;
    //发表时间
    private Date createTime;
    //更新时间
    private Date updateTime;
}
