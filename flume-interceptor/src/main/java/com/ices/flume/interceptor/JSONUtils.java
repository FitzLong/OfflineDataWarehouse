package com.ices.flume.interceptor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class JSONUtils {

    public static void main(String[] args) {
        System.out.println(isValidate("{123456)"));
        System.out.println(isValidate("{\"age\":123456}"));
    }

    // 验证数据是否是Json
    public static boolean isValidate(String log) {
        try{
            JSON.parse(log);
            return true;

        }catch (JSONException e){
            return false;
        }

    }
}
