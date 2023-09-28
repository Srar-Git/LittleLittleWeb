package cn.littlelittleweb.Controller.ArticleController;

import cn.littlelittleweb.Domain.ResponseResult;
import cn.littlelittleweb.Service.ArticleService.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categoryList")
    public ResponseResult getArticleCategoryList(){
        return categoryService.getArticleCategoryList();
    }


}
