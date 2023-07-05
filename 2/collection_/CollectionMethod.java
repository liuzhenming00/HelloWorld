package com.collection_;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {
        List List = new ArrayList();
        List.add("jack");
        List.add(10);
        List.add(true);
        System.out.println("List = " +List);
        List.remove(true);
        System.out.println("List=" +List);
        System.out.println(List.contains(10));
        System.out.println(List.size());
        System.out.println(List.isEmpty());
        List.clear();
        System.out.println(List);
        List list = new ArrayList();
        list.add("hong");
        list.add("wang");
        List.addAll(list);
        System.out.println(List);
        System.out.println(List.containsAll(list));
        List.add("liu");
        List.removeAll(list);
        System.out.println(List);

    }
}
