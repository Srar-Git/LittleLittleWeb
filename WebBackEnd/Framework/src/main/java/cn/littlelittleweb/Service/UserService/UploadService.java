package cn.littlelittleweb.Service.UserService;


import cn.littlelittleweb.Domain.ResponseResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface UploadService {
    ResponseResult uploadImg(MultipartFile img) throws IOException;
}
