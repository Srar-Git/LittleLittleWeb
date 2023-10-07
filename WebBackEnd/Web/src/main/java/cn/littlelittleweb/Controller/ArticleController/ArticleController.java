package cn.littlelittleweb.Controller.ArticleController;


import cn.littlelittleweb.Domain.ResponseResult;
import cn.littlelittleweb.Service.ArticleService.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;


    @GetMapping("/hottestArticleList")
    public ResponseResult getHottestArticleList(){
        return articleService.hottestArticleList();
    }

    @GetMapping("/articleList")
    public ResponseResult getArticleList(Integer pageNum, Integer pageSize, Integer categoryId){
        return articleService.articleList(pageNum, pageSize, categoryId);
    }
    @GetMapping("/articleDetail")
    public ResponseResult getArticleDetail(Integer articleId){
        return articleService.articleDetail(articleId);
    }




}
