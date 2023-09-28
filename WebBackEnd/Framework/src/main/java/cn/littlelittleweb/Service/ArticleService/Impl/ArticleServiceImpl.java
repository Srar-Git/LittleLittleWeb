package cn.littlelittleweb.Service.ArticleService.Impl;

import cn.littlelittleweb.Domain.Entity.ArticleEntity.Article;
import cn.littlelittleweb.Domain.Entity.ArticleEntity.Category;
import cn.littlelittleweb.Domain.ResponseResult;
import cn.littlelittleweb.Domain.VO.ArticleVO.ArticleListVO;
import cn.littlelittleweb.Domain.VO.ArticleVO.HottestArticleVO;
import cn.littlelittleweb.Domain.VO.ArticleVO.PageVO;
import cn.littlelittleweb.Mapper.ArticleMapper.ArticleMapper;
import cn.littlelittleweb.Service.ArticleService.ArticleService;
import cn.littlelittleweb.Service.ArticleService.CategoryService;
import cn.littlelittleweb.StaticContent.StaticContent;
import cn.littlelittleweb.Utils.BeanCopyUtils;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService  {

    @Autowired
    private CategoryService categoryService;

    //查询热门文章后封装为responseresult
    @Override
    public ResponseResult hottestArticleList() {
        LambdaQueryWrapper<Article> queryWrapper = new LambdaQueryWrapper<>();
        //状态为公开的文章
        queryWrapper.eq(Article::getStatus, StaticContent.ARTICLE_STATUS_PUBLIC);
        //按照浏览量进行排序
        queryWrapper.orderByDesc(Article::getViews);
        //最多查10条
        Page<Article> page = new Page<>(1,10);
        page(page, queryWrapper);
        List<Article> articles = page.getRecords();
        //bean拷贝
        //        List<HottestArticleVO> articleVOs = new ArrayList<>();
        //        for (Article article : articles) {
        //            HottestArticleVO hottestArticleVO = new HottestArticleVO();
        //            BeanUtils.copyProperties(article, hottestArticleVO);
        //            articleVOs.add(hottestArticleVO);
        //        }
        List<HottestArticleVO> articleVOs = BeanCopyUtils.copyBeanList(articles, HottestArticleVO.class);
        return ResponseResult.okResult(articleVOs);
    }

    @Override
    public ResponseResult articleList(Integer pageNum, Integer pageSize, Integer categoryId) {
        LambdaQueryWrapper<Article> queryWrapper = new LambdaQueryWrapper<>();
        //如果有传入ID，就要求查询对应分类的文章
        queryWrapper.eq(Objects.nonNull(categoryId)&&categoryId>0, Article::getCategoryId, categoryId);
        //必须是public的文章
        queryWrapper.eq(Article::getStatus, StaticContent.ARTICLE_STATUS_PUBLIC);
        //置顶的放在最前面
        queryWrapper.orderByDesc(Article::getIsRecommend);
        //分页查询
        Page<Article> page = new Page<>(pageNum,pageSize);
        page(page, queryWrapper);

        //找出分类name
        List<Article> articles = page.getRecords();
        for (Article article: articles){
            Category category = categoryService.getById(article.getCategoryId());
            article.setCategoryName(category.getCategoryName());
        }


        List<ArticleListVO> articleVOs = BeanCopyUtils.copyBeanList(articles, ArticleListVO.class);
        PageVO pageVO = new PageVO(articleVOs, page.getTotal());
        return ResponseResult.okResult(pageVO);
    }


}
