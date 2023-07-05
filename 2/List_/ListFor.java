package com.List_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListFor {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("鱼香肉丝");
        list.add("北京烤鸭");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        for (Object o : list) {
            System.out.println(o);

        }
        System.out.println("普通");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));

        }

    }
}
