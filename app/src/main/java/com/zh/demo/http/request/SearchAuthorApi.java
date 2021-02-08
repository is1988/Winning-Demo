package com.zh.demo.http.request;

import com.hjq.http.config.IRequestApi;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/EasyHttp
 *    time   : 2019/11/18
 *    desc   : 按照作者昵称搜索文章
 */
public final class SearchAuthorApi implements IRequestApi {

    @Override
    public String getApi() {
        return "AppApi/testArrayApi";
    }

    /** 作者昵称，不支持模糊匹配 */
    private String testString;

    public SearchAuthorApi setAuthor(String author) {
        this.testString = author;
        return this;
    }
}