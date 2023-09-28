package cn.littlelittleweb.Service.ArticleService;

import cn.littlelittleweb.Domain.Entity.ArticleEntity.Article;
import cn.littlelittleweb.Domain.ResponseResult;
import com.baomidou.mybatisplus.extension.service.IService;

public interface ArticleService extends IService<Article> {
    ResponseResult hottestArticleList();


    ResponseResult articleList(Integer pageNum, Integer pageSize, Integer categoryId);
}
