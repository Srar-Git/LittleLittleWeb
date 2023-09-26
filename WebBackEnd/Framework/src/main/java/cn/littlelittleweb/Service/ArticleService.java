package cn.littlelittleweb.Service;

import cn.littlelittleweb.Domain.Entity.Article;
import cn.littlelittleweb.Domain.ResponseResult;
import com.baomidou.mybatisplus.extension.service.IService;

public interface ArticleService extends IService<Article> {
    ResponseResult hottestArticleList();

    ResponseResult getArticleTypeList();
}
