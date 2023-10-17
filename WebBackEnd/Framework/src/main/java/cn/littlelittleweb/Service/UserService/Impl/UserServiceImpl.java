package cn.littlelittleweb.Service.UserService.Impl;

import cn.littlelittleweb.Domain.Entity.UserEntity.User;
import cn.littlelittleweb.Domain.ResponseResult;
import cn.littlelittleweb.Domain.VO.UserVO.UserInfoVo;
import cn.littlelittleweb.Mapper.UserMapper.UserMapper;
import cn.littlelittleweb.Service.UserService.UserService;
import cn.littlelittleweb.Utils.BeanCopyUtils;
import cn.littlelittleweb.Utils.SecurityUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public ResponseResult userInfo() {
        //获取当前用户id
        Long userId = SecurityUtils.getUserId();
        //根据用户id查询用户信息
        User user = getById(userId);
        //封装成UserInfoVo
        UserInfoVo vo = BeanCopyUtils.copyBean(user, UserInfoVo.class);
        return ResponseResult.okResult(vo);
    }
}
