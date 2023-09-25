package cn.littlelittleweb.Service.Impl;

import cn.littlelittleweb.Domain.Entity.Article;
import cn.littlelittleweb.Mapper.ArticleMapper;
import cn.littlelittleweb.Service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService  {
}
