package com.example.m1k3y.projecti.models;

public class MessageModel {
    public  String time;
    public String username;
    public String content;
    public String profilePhotoUrl;

    public MessageModel(String time, String username, String content, String profilePhotoUrl) {
        this.time = time;
        this.username = username;
        this.content = content;
        this.profilePhotoUrl = profilePhotoUrl;
    }

    public MessageModel() {
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getProfilePhotoUrl() {
        return profilePhotoUrl;
    }

    public void setProfilePhotoUrl(String profilePhotoUrl) {
        this.profilePhotoUrl = profilePhotoUrl;
    }

    @Override
    public String toString() {
        return "MessageModel{" +
                "time='" + time + '\'' +
                ", username='" + username + '\'' +
                ", content='" + content + '\'' +
                ", profilePhotoUrl='" + profilePhotoUrl + '\'' +
                '}';
    }
}
