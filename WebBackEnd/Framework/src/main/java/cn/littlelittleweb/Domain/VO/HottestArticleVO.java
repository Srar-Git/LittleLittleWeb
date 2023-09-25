package cn.littlelittleweb.Domain.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class HottestArticleVO {

    private Integer id;
    //作者id
    private Integer userId;
    //分类id
    private Integer categoryId;
    //缩略图
    private String articleCover;
    //文章标题
    private String articleTitle;
    //文章简介
    private String articleSummary;
    //查看数量
    private Integer views;
    //发表时间
    private Date createTime;

}
