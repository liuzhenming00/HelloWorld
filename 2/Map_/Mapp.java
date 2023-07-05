package com.Map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"all"})
public class Mapp {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","韩顺平");
        map.put("no2","张无忌");
        map.put("no1","张三丰");
        map.put("no3","张三丰");
        map.put(null,null);
        map.put(null,"abc");
        map.put("no4","abc");
        map.put("no5","abc");
        map.put(1,"abc");
        map.put(new Object(),"abc");
        System.out.println(map);
        System.out.println(map.get("no3"));
        Set set = map.entrySet();
        System.out.println(set.getClass());
        for (Object o :set) {
            Map.Entry o1 = (Map.Entry) o;
            System.out.println(o1.getKey()+"_" +o1.getValue());

        }

    }
}
