package com.collection_;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_ {
    public static void main(String[] args) {
       List list = new ArrayList();
       list.add("tom");
       list.add("tom");
       list.add("smith");
       list.add("king");
       list.add("milan");
        Collections.reverse(list);
        System.out.println("list =" + list);
        for (int i = 0; i <= 5; i++){
            Collections.shuffle(list);
            System.out.println("list =" + list);
        }
        Collections.sort(list);
        System.out.println("自然排序后" );
        System.out.println("list =" + list);
        Collections.sort(list, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length()-((String)o2).length();
            }
        });
        System.out.println("list =" + list);
        Collections.swap(list,0,1);
        System.out.println("交换后");
        System.out.println("list="+list);
        System.out.println("max="+Collections.max(list));
        Object max = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length()-((String)o2).length();
            }
        });
        System.out.println("长度最大=" +max);
        System.out.println("tom出现的次数" +Collections.frequency(list,"tom"));
        List dest = new ArrayList();
        for (int i = 0;i < list.size();i++)
        {
            dest.add("");
        }
        Collections.copy(dest,list);
        System.out.println("dest=" +dest);
        Collections.replaceAll(list,"tom","汤姆");
        System.out.println("替换后=" +list);


    }
}
