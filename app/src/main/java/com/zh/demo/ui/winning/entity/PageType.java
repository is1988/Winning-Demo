package com.zh.demo.ui.winning.entity;

/**
 * ———— author : 郑皓
 * ———— time : 2021/02/05   Friday
 * ———— desc :
 */
public class PageType {


    private String name;
    private int type;

    public PageType(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
