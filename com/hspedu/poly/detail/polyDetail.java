package com.hspedu.poly.detail;

public class polyDetail {

    public static void main(String[] args) {
        Animal animal = new Cat();
//        animal.eat();
//        animal.sleep();
//        animal.run();
//        animal.show();
        Cat cat = (Cat) animal;
        cat.eatMouse();
        cat.catchMouse();

    }
}
