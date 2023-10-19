package cn.littlelittleweb.Service.UserService.Impl;

import cn.littlelittleweb.Domain.ResponseResult;
import cn.littlelittleweb.Enums.AppHttpCodeEnum;
import cn.littlelittleweb.Exception.SystemException;
import cn.littlelittleweb.Service.UserService.UploadService;
import cn.littlelittleweb.Utils.PathUtils;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.PutObjectRequest;
import com.aliyun.oss.model.PutObjectResult;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

@Service
@Data
@ConfigurationProperties(prefix = "oss")
public class UploadServiceImpl implements UploadService {

//    @Value("${oss.accessKey}")
    private String accessKey;

//    @Value("${oss.secretKey}")
    private String secretKey;

//    @Value("${oss.bucket}")
    private String bucket;

//    @Value("${oss.endpoint}")
    private String endpoint;

    @Override
    public ResponseResult uploadImg(MultipartFile img) throws IOException {
        //判断文件类型
        //获取原始文件名
        String originalFilename = img.getOriginalFilename();
        //对原始文件名进行判断
        if(!(originalFilename.endsWith(".png") || originalFilename.endsWith(".jpg"))){
            throw new SystemException(AppHttpCodeEnum.FILE_TYPE_ERROR);
        }

        //如果判断通过上传文件到OSS
        String filePath = PathUtils.generateFilePath(originalFilename);
//        String url = uploadOss(img,filePath);//七牛云  2099/2/3/wqeqeqe.png
        String url = uploadFile(filePath,img.getInputStream());//七牛云  2099/2/3/wqeqeqe.png


        return ResponseResult.okResult(url);
    }



    private String uploadFile(String filePath, InputStream inputStream) {
        // yourEndpoint填写Bucket所在地域对应的Endpoint。以华东1（杭州）为例，Endpoint填写为https://oss-cn-hangzhou.aliyuncs.com。



        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。


//        String accessKeyId;
//        String accessKeySecret = "wqeqrqrqwe";
//        String bucketName = "sg-blog-oss";
        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKey, secretKey);
        // 创建PutObjectRequest对象。
        // 依次填写Bucket名称（例如examplebucket）和Object完整路径（例如exampledir/exampleobject.txt）。Object完整路径中不能包含Bucket名称。
        PutObjectRequest putObjectRequest = new PutObjectRequest(bucket, filePath, inputStream);

        // 如果需要上传时设置存储类型和访问权限，请参考以下示例代码。
        // ObjectMetadata metadata = new ObjectMetadata();
        // metadata.setHeader(OSSHeaders.OSS_STORAGE_CLASS, StorageClass.Standard.toString());
        // metadata.setObjectAcl(CannedAccessControlList.Private);
        // putObjectRequest.setMetadata(metadata);

        // 上传字符串。
        PutObjectResult putObjectResult = ossClient.putObject(putObjectRequest);

        // 关闭OSSClient。
        ossClient.shutdown();
        return "https://"+bucket+"."+endpoint+"/"+filePath;
    }
}
