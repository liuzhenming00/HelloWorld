package com.collection_;

import java.util.ArrayList;
import java.util.Collection;

public class CollcetionFor {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义","罗贯中",10.1));
        col.add(new Book("效力肥大","古龙",5.1));
        col.add(new Book("红楼梦","曹雪芹",34.6));
        for (Object book : col){
            System.out.println(book);
        }

    }
}
