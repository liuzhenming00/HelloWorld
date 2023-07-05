package com.Arrays;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("LinkedList = "+linkedList);
        linkedList.remove(1);
        System.out.println("LinkedList = "+linkedList);
        linkedList.set(1,999);
        System.out.println("LinkedList = "+linkedList);
        Object o = linkedList.get(1);
        System.out.println(o);
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        for (Object o1 :linkedList) {
            System.out.println(o1);


        }
        for (int i = 0; i <linkedList.size() ; i++) {
            System.out.println(linkedList.get(i));

        }

    }
}
