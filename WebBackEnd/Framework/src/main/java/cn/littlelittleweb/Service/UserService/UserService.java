package cn.littlelittleweb.Service.UserService;

import cn.littlelittleweb.Domain.Entity.UserEntity.User;
import cn.littlelittleweb.Domain.ResponseResult;
import com.baomidou.mybatisplus.extension.service.IService;

public interface UserService  extends IService<User> {


    ResponseResult userInfo();
}
