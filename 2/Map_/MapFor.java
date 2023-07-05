package com.Map_;

import java.util.*;

public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超",new Book("",100));
        map.put("邓超","孙俪");
        map.put("王宝强","马蓉");
        map.put("宋喆","马蓉");
        map.put("刘令博","null");
        map.put(null,"刘亦菲");
        map.put("鹿晗","关晓彤");
        map.put("hsp","关晓彤");
        Set keySet = map.keySet();
        System.out.println("第一种方式");
        for (Object key: keySet) {
            System.out.println(key +"-"+map.get(key));

        }
        System.out.println("第二种方式");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key +"-"+map.get(key));

        }
        Collection values = map.values();
        for (Object value :values) {
            System.out.println(value);

        }
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value = iterator1.next();
            System.out.println(value);
        }
        System.out.println("====entrySet  for====");
        Set set = map.entrySet();
        for (Object o :set) {
            Map.Entry o1 = (Map.Entry) o;
            System.out.println(o1.getKey()+"-"+o1.getValue());

        }
        System.out.println("====entrySet  迭代器====");
        Iterator iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            Object next =  iterator2.next();
            Map.Entry next1 = (Map.Entry) next;
            System.out.println( next1.getKey()+"-"+next1.getValue());

        }


    }
}
