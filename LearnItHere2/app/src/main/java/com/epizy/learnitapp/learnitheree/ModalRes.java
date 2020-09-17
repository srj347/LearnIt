package com.epizy.learnitapp.learnitheree;

public class ModalRes {
    String title_res;
    int thumbnail;
    String url;

    public ModalRes(String title_res, int thumbnail,String url) {
        this.title_res = title_res;
        this.thumbnail = thumbnail;
        this.url = url;
    }

    public String getTitle_res() {
        return title_res;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public String getUrl() {
        return url;
    }
}
