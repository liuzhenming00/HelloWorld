package com.homework;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HomeWork01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("新馆确诊病例超过千万，数百万印度教信徒赴恒河\"圣浴\"引民众担忧"));
        arrayList.add(new News("你提哦那你好他还没他们童话那就"));
        for (int i = arrayList.size()-1; i >=0 ; i--) {
            News news = (News) arrayList.get(i);
            System.out.println(processTitle(news.getTitle()));

        }
    }
    public static String processTitle(String title){
        if (title == null){
            return "";
        }
        if (title.length()>15){
            return title.substring(0,15)+"....";
        }else {
            return title;
        }
    }
}
class News{
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}
