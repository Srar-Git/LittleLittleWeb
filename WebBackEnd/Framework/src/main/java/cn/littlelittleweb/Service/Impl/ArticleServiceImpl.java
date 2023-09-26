package cn.littlelittleweb.Service.Impl;

import cn.littlelittleweb.Domain.Entity.Article;
import cn.littlelittleweb.Domain.ResponseResult;
import cn.littlelittleweb.Domain.VO.HottestArticleVO;
import cn.littlelittleweb.Mapper.ArticleMapper;
import cn.littlelittleweb.Service.ArticleService;
import cn.littlelittleweb.StaticContent.StaticContent;
import cn.littlelittleweb.Utils.BeanCopyUtils;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService  {

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
    public ResponseResult getArticleTypeList() {
        return null;
    }
}
