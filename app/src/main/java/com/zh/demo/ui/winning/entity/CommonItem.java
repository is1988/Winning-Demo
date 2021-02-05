package com.zh.demo.ui.winning.entity;

/**
 * ———— author : 郑皓
 * ———— time : 2021/02/05   Friday
 * ———— desc :
 */
public class CommonItem {


    private String name;
    private String time;

    public CommonItem(String name, String time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
