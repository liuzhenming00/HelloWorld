package com.improve;

import java.util.ArrayList;

public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("宝马",100);
        System.out.println("=========");
        car.fly(19,100.1);
        Fish<String, ArrayList> fish = new Fish<>();
        fish.hello(new ArrayList(),11.3f);
    }
}
class Car{
    public void run(){

    }
    public <T,R>void fly(T t,R r){
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}
class Fish<T,R>{
    public void run(){

    }
    public<U,M>void  eat(U u,M m){

    }
    public <K> void hello(R r,K k){
        System.out.println(r.getClass());
        System.out.println(k.getClass());
    }
}
