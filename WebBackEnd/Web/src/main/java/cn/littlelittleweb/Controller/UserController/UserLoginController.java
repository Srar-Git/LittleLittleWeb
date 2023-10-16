package cn.littlelittleweb.Controller.UserController;

import cn.littlelittleweb.Domain.Entity.UserEntity.User;
import cn.littlelittleweb.Domain.ResponseResult;
import cn.littlelittleweb.Enums.AppHttpCodeEnum;
import cn.littlelittleweb.Exception.SystemException;
import cn.littlelittleweb.Service.UserService.UserLoginService;
import org.apache.poi.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController {


    @Autowired
    private UserLoginService userLoginService;


    @PostMapping("/login")
    public ResponseResult login(@RequestBody User user){
        if(!StringUtils.hasText(user.getUserName())){
            //提示： 必须要传用户
//            throw new RuntimeException()
            throw new SystemException(AppHttpCodeEnum.REQUIRE_USERNAME);
        }

        return userLoginService.login(user);
    }

}
