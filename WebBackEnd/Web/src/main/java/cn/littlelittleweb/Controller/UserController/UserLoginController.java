package cn.littlelittleweb.Controller.UserController;

import cn.littlelittleweb.Domain.Entity.UserEntity.User;
import cn.littlelittleweb.Domain.ResponseResult;
import cn.littlelittleweb.Service.UserService.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController {


    @Autowired
    private UserLoginService userLoginService;


    @PostMapping("/login")
    public ResponseResult login(@RequestBody User user){
        return userLoginService.login(user);
    }

}
