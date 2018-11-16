package com.example.m1k3y.projecti.models;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;

public class MessageModel {
    private String time;
    private String username;
    private String content;
    private Drawable drawable;

    public MessageModel(String time, String username, String content, Drawable drawable) {
        this.time = time;
        this.username = username;
        this.content = content;
        this.drawable = drawable;
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

    public Drawable getDrawable() {
        return drawable;
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }
}
