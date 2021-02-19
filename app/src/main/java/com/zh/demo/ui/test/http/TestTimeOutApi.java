package com.zh.demo.ui.test.http;

import com.hjq.http.config.IRequestApi;

/**
 * ———— author : 郑皓
 * ———— time : 2021/02/18   Thursday
 * ———— desc : 测试接口（超时）
 */
public class TestTimeOutApi implements IRequestApi {

    @Override
    public String getApi() {
        return "AppApi/testOverTimeApi";
    }
}
