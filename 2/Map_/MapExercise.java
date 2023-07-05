package com.Map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, new Emp("jack", 10000, 1));
        map.put(2, new Emp("tom", 122000, 2));
        map.put(3, new Emp("milan", 111000, 3));
        Set set = map.keySet();
        for (Object o :set) {
            Emp emp = (Emp) map.get(o);
            if (emp.getSal()>18000){
                System.out.println(emp);
            }
        }
        System.out.println("============");
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry next =  (Map.Entry) iterator.next();
            Emp value = (Emp) next.getValue();
            if (value.getSal() > 18000)
            System.out.println(next);
        }


    }
}

class Emp {
    private String name;
    private double sal;
    private int id;

    public Emp(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}