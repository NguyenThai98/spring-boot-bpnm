package com.camunda.spring.utils;

public class ReponseCtl<T> {
    private String status;

    private T data;
    private int code;

    public String getStatus() {
        return status;
    }

    public static class Builder<T>{
        private String status;
        private T data;
        private int code;

        public Builder status(String status){
            this.status = status;
            return this;
        }

        public Builder data(T data){
            this.data = data;
            return this;
        }
        public Builder code(int code){
            this.code = code;
            return this;
        }
        public ReponseCtl build(){
            return new ReponseCtl(status,data,code);
        }

    }

    public ReponseCtl(String status, T data, int code) {
        this.status = status;
        this.data = data;
        this.code = code;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
