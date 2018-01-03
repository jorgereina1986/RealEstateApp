package com.jorgereina.www.realestateapp.model;

import android.widget.ImageView;

/**
 * Created by jorgereina on 11/29/17.
 */

public class Entry {

    private ImageView picture;
    private String title;
    private String description;
    private String date;
    private String uid;

    public Entry() {
    }

    public Entry(ImageView picture, String title, String description, String date, String uid) {
        this.picture = picture;
        this.title = title;
        this.description = description;
        this.date = date;
        this.uid = uid;
    }

    public ImageView getPicture() {
        return picture;
    }

    public void setPicture(ImageView picture) {
        this.picture = picture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
