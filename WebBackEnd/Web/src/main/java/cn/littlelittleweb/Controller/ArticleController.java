package cn.littlelittleweb.Controller;


import cn.littlelittleweb.Domain.Entity.Article;
import cn.littlelittleweb.Domain.ResponseResult;
import cn.littlelittleweb.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/hottestArticleList")
    public ResponseResult gethottestArticleList(){
        ResponseResult responseResult = articleService.hottestArticleList();
        return responseResult;
    }


}
