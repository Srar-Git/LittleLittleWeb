package cn.littlelittleweb.Service.ArticleService.Impl;

import cn.littlelittleweb.Domain.Entity.ArticleEntity.Article;
import cn.littlelittleweb.Domain.Entity.ArticleEntity.Category;
import cn.littlelittleweb.Domain.ResponseResult;
import cn.littlelittleweb.Mapper.ArticleMapper.CategoryMapper;
import cn.littlelittleweb.Service.ArticleService.ArticleService;
import cn.littlelittleweb.Service.ArticleService.CategoryService;
import cn.littlelittleweb.StaticContent.StaticContent;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private ArticleService articleService;
    //查询已经公开的文章类别
    @Override
    public ResponseResult getArticleCategoryList() {


        LambdaQueryWrapper<Category> queryWrapper = new LambdaQueryWrapper<>();


        //先把公开的文章拿出来
        LambdaQueryWrapper<Article> articleWrapper = new LambdaQueryWrapper<>();
        articleWrapper.eq(Article::getStatus, StaticContent.ARTICLE_STATUS_PUBLIC);
        List<Article> articleList = articleService.list(articleWrapper);

        //获取这些文章的分类id
        List<Integer> categoryIDs = articleList.stream()
                .map(article -> article.getCategoryId())
                .distinct()
                .collect(Collectors.toList());

        //查询分类
        List<Category> categoryList = listByIds(categoryIDs);

        //封装VO
        return ResponseResult.okResult(categoryList);
    }
}
