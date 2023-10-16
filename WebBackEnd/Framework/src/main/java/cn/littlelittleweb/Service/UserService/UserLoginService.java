package cn.littlelittleweb.Service.UserService;

import cn.littlelittleweb.Domain.Entity.UserEntity.User;
import cn.littlelittleweb.Domain.ResponseResult;
import com.baomidou.mybatisplus.extension.service.IService;

public interface UserLoginService extends IService<User> {
    ResponseResult login(User user);

    ResponseResult logout();
}
