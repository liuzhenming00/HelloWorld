package com.List_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExercise02 {
    public static void main(String[] args) {
       // List list = new ArrayList();
       // List list = new Vector();
       List list = new LinkedList();
        list.add(new Book("红","cao",100));
        list.add(new Book("西","wu",10));
        list.add(new Book("水","shi",19));
        list.add(new Book("三","luo",80));
        for (Object o :list) {
            System.out.println(o);
        }
        System.out.println("交换后");
        sort(list);
        for (Object o :list) {
            System.out.println(o);
        }

    }
    public static void sort(List list){
        for (int i = 0; i <list.size()-1 ; i++) {
            for (int j = 0; j <list.size()-i-1 ; j++) {
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j+1);
                if (book1.getPrice()>book2.getPrice()){
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }

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
        return "名称:" + name +"\t\t价格:" + price + "\t\t作者:" + author;
    }
}
