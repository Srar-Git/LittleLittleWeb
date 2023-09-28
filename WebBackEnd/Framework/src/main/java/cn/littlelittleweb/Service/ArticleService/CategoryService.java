package cn.littlelittleweb.Service.ArticleService;

import cn.littlelittleweb.Domain.Entity.ArticleEntity.Category;
import cn.littlelittleweb.Domain.ResponseResult;
import com.baomidou.mybatisplus.extension.service.IService;

public interface CategoryService extends IService<Category> {


    ResponseResult getArticleCategoryList();

}
