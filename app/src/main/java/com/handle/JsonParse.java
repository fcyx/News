package com.handle;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class JsonParse {
    public static List<Newslnfo> getNewsInfo(String json) {
        //使用gson库解析JSON数据
        Gson gson = new Gson();
        //创建一个TypeToken的匿名子类对象，并调用对象的getType()方法
        Type listType = new TypeToken<List<Newslnfo>>() {
        }.getType();
        //把获取到的信息集合存到newsInfos中
        List<Newslnfo> newsInfos = gson.fromJson(json, listType);
        return newsInfos;
    }
}