package com.hspedu.poly;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }
    public void feed(Animal animal,Food food){
        System.out.println("主人" + name + "给" + animal.getName() + "吃" + food.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
