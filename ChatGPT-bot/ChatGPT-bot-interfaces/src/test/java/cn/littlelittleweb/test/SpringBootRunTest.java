package cn.littlelittleweb.test;

import cn.littlelittleweb.domain.ChatGPT.IOpenAI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @author pyf
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootRunTest {

    private Logger logger = LoggerFactory.getLogger(SpringBootRunTest.class);

    @Resource
    private IOpenAI openAI;


    @Test
    public void testOpenAI() throws IOException{
        String response = openAI.askQuestion("介绍一下java");
        logger.info("测试结果: {}", response);
    }

}
