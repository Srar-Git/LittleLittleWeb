package cn.littlelittleweb.domain.ChatGPT;

import java.io.IOException;

/**
 * @author pyf
 * @description 提供获取chatgpt回答的API， 查看网页https://platform.openai.com/account/api-keys
 */
public interface IOpenAI {

    // 向chatgpt提问，返回string结果
    String askQuestion(String question) throws IOException;


}
