package cn.littlelittleweb.Domain.VO.UserVO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author pyf
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginVO {

    private String token;
    private UserVO userVO;



}
