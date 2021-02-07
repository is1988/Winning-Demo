package com.zh.demo.ui.test.http;

import com.hjq.http.config.IRequestApi;

/**
 * ———— author : 郑皓
 * ———— time : 2021/02/07   Sunday
 * ———— desc :
 */
public final class TestLoginApi implements IRequestApi {

    @Override
    public String getApi() {
        return "AppApi/loginApi";
    }

    private String userid;
    private String password;

    public TestLoginApi setParams(String userid,String password) {
        this.userid = userid;
        this.password = password;
        return this;
    }
}