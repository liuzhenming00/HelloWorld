package com.set_;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        System.out.println(hashSet.add("john"));
        System.out.println(hashSet.add("lucy"));
        System.out.println(hashSet.add("john"));
        System.out.println(hashSet.add("jack"));
        System.out.println(hashSet.add("rose"));
        hashSet.remove("john");
        System.out.println(hashSet);
        hashSet = new HashSet();
        System.out.println(hashSet);
        hashSet.add("lucy");
        hashSet.add("lucy");
        hashSet.add(new Dog("tom"));
        hashSet.add(new Dog("tom"));
        System.out.println(hashSet);
        hashSet.add(new String("hsp"));
        hashSet.add(new String("hsp"));
        System.out.println(hashSet);
    }
}
class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
