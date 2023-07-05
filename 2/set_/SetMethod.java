package com.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethod {
    public static void main(String[] args) {
       Set set = new HashSet();
       set.add("john");
       set.add("lucy");
       set.add("john");
       set.add("jack");
       set.add(null);
        set.add("hsp");
       set.add(null);

       System.out.println(set);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        set.remove(null);
        System.out.println("================");
        for (Object o :set) {
            System.out.println(o);

        }


    }
}
