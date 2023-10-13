package cn.littlelittleweb.Service.UserService.Impl;

import cn.littlelittleweb.Domain.Entity.ArticleEntity.Article;
import cn.littlelittleweb.Domain.Entity.UserEntity.User;
import cn.littlelittleweb.Mapper.ArticleMapper.ArticleMapper;
import cn.littlelittleweb.Mapper.UserMapper.UserMapper;
import cn.littlelittleweb.Service.ArticleService.ArticleService;
import cn.littlelittleweb.Service.UserService.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
