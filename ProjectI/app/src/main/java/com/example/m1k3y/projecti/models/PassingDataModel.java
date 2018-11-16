package com.example.m1k3y.projecti.models;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.Serializable;

public class PassingDataModel implements Serializable {
    private String username;
    private String accountId;
    private String profilePhotoUrl;
    private Drawable profileDrawable;


    public PassingDataModel(String username, String accountId, String profilePhotoUrl, Drawable profileDrawable) {
        this.username = username;
        this.accountId = accountId;
        this.profilePhotoUrl = profilePhotoUrl;
        this.profileDrawable = profileDrawable;


    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getProfilePhotoUrl() {
        return profilePhotoUrl;
    }

    public void setProfilePhotoUrl(String profilePhotoUrl) {
        this.profilePhotoUrl = profilePhotoUrl;
    }

    public Drawable getProfileDrawable() {
        return profileDrawable;
    }

    public void setProfileDrawable(Drawable profileDrawable) {
        this.profileDrawable = profileDrawable;
    }
}
