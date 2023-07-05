package com.homework;

import java.util.*;

public class Homework03 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("jack",650);
        map.put("tom",1200);
        map.put("smith",2900);
        System.out.println(map);
        map.put("jack",2600);
        System.out.println(map);
        Set set = map.keySet();
        for (Object o :set) {
            map.put(o,(Integer)map.get(o)+100);

        }
        System.out.println(map);
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry next = (Map.Entry)iterator.next();
            System.out.println(next.getKey()+"-"+next.getValue());
        }
        Collection values = map.values();
        for (Object o :values) {
            System.out.println("工资"+o );

        }


    }
}
