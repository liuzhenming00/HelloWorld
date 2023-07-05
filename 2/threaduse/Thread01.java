package com.hspedu.threaduse;

public class Thread01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.start();
    }
}
class Cat extends Thread{
    int times=0;
    @Override
    public void run() {
        while (true) {
        System.out.println("喵喵，我是小猫咪"+(++times));

           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           if (times == 8){
               break;
           }
       }
    }
}