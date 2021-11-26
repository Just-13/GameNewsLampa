package com.example.gamenewslampa;

public class ModelClass {

    private String title, type, img, click_url, time, top;

    public ModelClass(String title, String type, String img, String click_url, String time, String top) {
        this.title = title;
        this.type = type;
        this.img = img;
        this.click_url = click_url;
        this.time = time;
        this.top = top;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getClick_url() {
        return click_url;
    }

    public void setClick_url(String click_url) {
        this.click_url = click_url;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }
}
