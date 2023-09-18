package cn.littlelittleweb.Domain.ChatGPT.Service;

import cn.littlelittleweb.Domain.ChatGPT.IOpenAI;
import cn.littlelittleweb.Domain.ChatGPT.Model.Aggregate.ChatGPTAnswer;
import cn.littlelittleweb.Domain.ChatGPT.Model.VO.Choices;
import com.alibaba.fastjson.JSON;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @author pyf
 * @description 实现IOpenAI的接口
 */

@Service
public class OpenAI implements IOpenAI {
    private Logger logger = LoggerFactory.getLogger(OpenAI.class);

    @Value("${chatgpt.openAIKey}")
    private String openAIKey;

    @Override
    public String askQuestion(String question) throws IOException {

        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost("https://open.aiproxy.xyz/v1/chat/completions");
        post.addHeader("Content-Type", "application/json");
        post.addHeader("Authorization", "Bearer " + openAIKey);
        String paramJson = "{\n" +
                "     \"model\": \"gpt-3.5-turbo\",\n" +
                "     \"messages\": [{\"role\": \"user\", \"content\": \"" + question + "\"}],\n" +
                "     \"temperature\": 0.7\n" +
                "   }";
        StringEntity stringEntity = new StringEntity(paramJson, ContentType.create("text/json", "UTF-8"));
        post.setEntity(stringEntity);
        CloseableHttpResponse response = httpClient.execute(post);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
            String jsonStr = EntityUtils.toString(response.getEntity());
            ChatGPTAnswer chatGPTAnswer = JSON.parseObject(jsonStr, ChatGPTAnswer.class);
            StringBuilder answers = new StringBuilder();
            List<Choices> choices = chatGPTAnswer.getChoices();
            for (Choices choice : choices){
                answers.append(choice.getMessage().getContent());
            }
            return answers.toString();
        }else{
            throw  new RuntimeException("get openai answer error, ERROR CODE: " + response.getStatusLine().getStatusCode());
        }
    }

}
