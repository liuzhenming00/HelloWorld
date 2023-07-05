package com.hspedu.poly;

public class Poly {
    public static void main(String[] args) {
        Master tom = new Master("tom");
        Bone bone = new Bone("骨头");
        Dog dog = new Dog("阿黄");
        tom.feed(dog,bone);
        System.out.println("=========");
        Fish fish = new Fish("鲍鱼");
        Cat cat = new Cat("小花");
        tom.feed(cat,fish);
    }
}
