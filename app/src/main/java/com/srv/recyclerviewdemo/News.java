package com.srv.recyclerviewdemo;

public class News {

    private String title;
    private String content;
    private int imageRes;

    public News() {
    }

    public News(String title, String content, int imageRes) {
        this.title = title;
        this.content = content;
        this.imageRes = imageRes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }
}
