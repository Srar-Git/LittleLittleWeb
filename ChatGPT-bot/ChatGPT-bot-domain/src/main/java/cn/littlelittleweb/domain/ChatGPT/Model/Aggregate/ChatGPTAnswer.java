package cn.littlelittleweb.domain.ChatGPT.Model.Aggregate;

import cn.littlelittleweb.domain.ChatGPT.Model.VO.Choices;
import cn.littlelittleweb.domain.ChatGPT.Model.VO.Usage;

import java.util.List;

/**
 * @author pyf
 * @description 完整的一个回答
 */

public class ChatGPTAnswer {

    private String id;
    private String object;
    private String model;
    private long created;
    private List<Choices> choices;
    private Usage usage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public List<Choices> getChoices() {
        return choices;
    }

    public void setChoices(List<Choices> choices) {
        this.choices = choices;
    }

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }
}
