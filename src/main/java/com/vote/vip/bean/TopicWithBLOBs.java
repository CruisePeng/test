package com.vote.vip.bean;

public class TopicWithBLOBs extends Topic {
    private String topicContent;

    private String topicPrecondition;

    private String topicOption;

    public String getTopicContent() {
        return topicContent;
    }

    public void setTopicContent(String topicContent) {
        this.topicContent = topicContent == null ? null : topicContent.trim();
    }

    public String getTopicPrecondition() {
        return topicPrecondition;
    }

    public void setTopicPrecondition(String topicPrecondition) {
        this.topicPrecondition = topicPrecondition == null ? null : topicPrecondition.trim();
    }

    public String getTopicOption() {
        return topicOption;
    }

    public void setTopicOption(String topicOption) {
        this.topicOption = topicOption == null ? null : topicOption.trim();
    }
}