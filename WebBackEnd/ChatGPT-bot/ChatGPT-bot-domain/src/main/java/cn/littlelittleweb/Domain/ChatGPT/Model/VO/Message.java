package cn.littlelittleweb.Domain.ChatGPT.Model.VO;

/**
 * @author pyf
 * @description 结果中的-choices-message
 */

public class Message {
    private String role;

    //这个就是答案
    private String content;

    public Message(String role, String content) {
        this.role = role;
        this.content = content;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
