package com.List_;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");
        list.add(1,"宝玉");
        System.out.println(list);
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1,list2);
        System.out.println(list);
        System.out.println(list.indexOf("jack"));
        list.add("jack");
        System.out.println(list);
        System.out.println(list.lastIndexOf("jack"));
        list.remove(0);
        System.out.println(list);
        list.set(1,"玛丽");
        System.out.println(list);
        List subList = list.subList(0, 2);
        System.out.println(subList);

    }
}
