package com.example.messageapp;

public class Messages {

    private int messageId;
    private String message;
    private String messageAuthor;
    private String MessageDate;

    public Messages( String message, String messageAuthor, String messageDate) {
        this.message = message;
        this.messageAuthor = messageAuthor;
        MessageDate = messageDate;
    }

    public Messages(){

    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageAuthor() {
        return messageAuthor;
    }

    public void setMessageAuthor(String messageAuthor) {
        this.messageAuthor = messageAuthor;
    }

    public String getMessageDate() {
        return MessageDate;
    }

    public void setMessageDate(String messageDate) {
        MessageDate = messageDate;
    }
}
