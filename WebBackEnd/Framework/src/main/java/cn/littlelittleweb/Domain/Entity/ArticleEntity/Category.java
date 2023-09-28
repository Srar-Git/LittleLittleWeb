package cn.littlelittleweb.Domain.Entity.ArticleEntity;

import java.util.Date;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (Category)实体类
 *
 * @author makejava
 * @since 2023-09-27 13:16:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("serial")
@TableName("web_category")
public class Category {
/**
     * 分类id
     */
    private Integer id;
/**
     * 分类名
     */
    private String categoryName;
/**
     * 分类徽章颜色
     */
    private String categoryBadgeColor;
/**
     * 创建时间
     */
    private Date createTime;
}

