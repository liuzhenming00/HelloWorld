package com.homework;



import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        car car1 = new car("宝马", 400000);
        car car2 = new car("宾利", 500000);
        arrayList.add(car1);
        arrayList.add(car2);
        System.out.println(arrayList);
        arrayList.remove(car1);
        System.out.println(arrayList);
        System.out.println(arrayList.contains(car1));
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        arrayList.addAll(arrayList);
        System.out.println(arrayList);
        System.out.println(arrayList.containsAll(arrayList));
        for (Object o :arrayList) {
            car o1 = (car) o;
            System.out.println(o1);

        }
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();

            System.out.println(next);
        }


    }
}
class car{
    private String name;
    private double price;

    public car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
