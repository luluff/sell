package com.lulu.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by lulu
 * 2019-07-04 01:30
 */
public class JsonUtil {

    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
