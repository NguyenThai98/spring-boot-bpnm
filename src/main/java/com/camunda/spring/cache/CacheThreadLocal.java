package com.camunda.spring.cache;

import java.util.LinkedHashMap;

public class CacheThreadLocal {
    private static ThreadLocal<LinkedHashMap<String, Object>> local = new ThreadLocal<>();



    public static void put(String key, Object data){

    }
    public static Object get(String key, boolean isClear){
        Object o = local.get().get(key);
        if (isClear){
            remove(key);
        }
        return o;

    }
    public static void remove(String key){
        local.get().remove(key);
    }
    public static void removeAll(){
        local.get().clear();
    }
}
