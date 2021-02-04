package com.zh.demo.ui.test;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * ———— author : 郑皓
 * ———— time : 2021/02/03   Wednesday
 * ———— desc :
 */
public class TestVO implements Serializable {


    /**
     * data : {"able":1,"beans":"300000","cash":"10.00","id":1,"status":1,"type":1}
     * message : success
     * result : 01
     */

    @SerializedName("data")
    private DataBean data;
    @SerializedName("message")
    private String message;
    @SerializedName("result")
    private String result;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public static class DataBean implements Serializable {
        /**
         * able : 1
         * beans : 300000
         * cash : 10.00
         * id : 1
         * status : 1
         * type : 1
         */

        @SerializedName("able")
        private Integer able;
        @SerializedName("beans")
        private String beans;
        @SerializedName("cash")
        private String cash;
        @SerializedName("id")
        private Integer id;
        @SerializedName("status")
        private Integer status;
        @SerializedName("type")
        private Integer type;

        public Integer getAble() {
            return able;
        }

        public void setAble(Integer able) {
            this.able = able;
        }

        public String getBeans() {
            return beans;
        }

        public void setBeans(String beans) {
            this.beans = beans;
        }

        public String getCash() {
            return cash;
        }

        public void setCash(String cash) {
            this.cash = cash;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }
    }
}
