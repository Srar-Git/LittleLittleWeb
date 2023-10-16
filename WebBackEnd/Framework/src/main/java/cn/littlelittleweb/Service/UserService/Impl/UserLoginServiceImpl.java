package cn.littlelittleweb.Service.UserService.Impl;

import cn.littlelittleweb.Domain.Entity.UserEntity.LoginUser;
import cn.littlelittleweb.Domain.Entity.UserEntity.User;
import cn.littlelittleweb.Domain.ResponseResult;
import cn.littlelittleweb.Domain.VO.UserVO.UserLoginVO;
import cn.littlelittleweb.Domain.VO.UserVO.UserVO;
import cn.littlelittleweb.Mapper.UserMapper.UserMapper;
import cn.littlelittleweb.Service.UserService.UserLoginService;
import cn.littlelittleweb.StaticContent.StaticContent;
import cn.littlelittleweb.Utils.BeanCopyUtils;
import cn.littlelittleweb.Utils.JwtUtil;
import cn.littlelittleweb.Utils.RedisCache;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserLoginServiceImpl extends ServiceImpl<UserMapper, User> implements UserLoginService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private RedisCache redisCache;

    @Override
    public ResponseResult login(User user) {
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(user.getUserName(), user.getPassword());
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);
        //判断是否认证通过
        if (Objects.isNull(authenticate)){
            throw new RuntimeException("用户名或者密码错误");
        }
        //获取userid、 生成token
        LoginUser loginUser = (LoginUser) authenticate.getPrincipal();
        Long userId = loginUser.getUser().getId();
        String jwt = JwtUtil.createJWT(userId.toString());
        //把用户信息存入redis
        redisCache.setCacheObject(StaticContent.REDIS_KEY_FRONTEND_USER +userId, loginUser);
        //把token和user info封装返回
        UserVO userVO = BeanCopyUtils.copyBean(loginUser.getUser(), UserVO.class);
        UserLoginVO vo = new UserLoginVO(jwt, userVO);
        return ResponseResult.okResult(vo);
    }
}
