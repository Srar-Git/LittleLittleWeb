package cn.littlelittleweb.test;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class ApiTest {

    @Test
    public void testChatGPT() throws IOException {
        String key = "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";
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost("https://open.aiproxy.xyz/v1/chat/completions");
        post.addHeader("Content-Type", "application/json");
        post.addHeader("Authorization", "Bearer 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");
        String paramJson = "{\n" +
                "     \"model\": \"gpt-3.5-turbo\",\n" +
                "     \"messages\": [{\"role\": \"user\", \"content\": \"介绍一下java\"}],\n" +
                "     \"temperature\": 0.7\n" +
                "   }";
        StringEntity stringEntity = new StringEntity(paramJson, ContentType.create("text/json", "UTF-8"));
        post.setEntity(stringEntity);
        CloseableHttpResponse response = httpClient.execute(post);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        }else{
            System.out.println("chatGPT post error(error code: "+ response.getStatusLine().getStatusCode() +")");
        }
    }
}
