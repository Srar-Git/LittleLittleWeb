package cn.littlelittleweb.Service.UserService.Impl;

import cn.littlelittleweb.Domain.Entity.UserEntity.LoginUser;
import cn.littlelittleweb.Domain.Entity.UserEntity.User;
import cn.littlelittleweb.Mapper.UserMapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.PortResolverImpl;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author pyf
 * @description
 */

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //根据用户名查询用户信息
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUserName, username);
        User user = userMapper.selectOne(queryWrapper);

        //判断是否查到用户，如果没查到就抛出异常
        if(Objects.isNull(user)){
            throw new RuntimeException("用户不存在");

        }


        //返回用户信息
        return new LoginUser(user);
    }
}
