package com.epizy.learnitapp.learnitheree;

public class Modal {

    String title;
    int icon;
    String url;

    public Modal(String title,String url, int icon) {
        this.title = title;
        this.icon = icon;
        this.url=url;

    }

    public String getTitle() {
        return title;
    }

    public int getIcon() {
        return icon;
    }

    public String getUrl() {
        return url;
    }
}
