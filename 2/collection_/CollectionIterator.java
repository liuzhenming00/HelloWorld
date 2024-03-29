package com.collection_;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义","罗贯中",10.1));
        col.add(new Book("效力肥大","古龙",5.1));
        col.add(new Book("红楼梦","曹雪芹",34.6));
        //System.out.println(col);
        Iterator iterator = col.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println("next = " + next);
        }
         iterator = col.iterator();
        System.out.println("第二次遍历");
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);

        }
    }
}
class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
