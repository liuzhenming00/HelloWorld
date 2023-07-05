package com.hspedu.method;

public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        Hi hi = new Hi();
        Thread thread = new Thread(hi);

        for (int i = 0; i <=10 ; i++) {

            System.out.println("hi"+i);
            if (i==5){
                thread.start();
                thread.join();
            }
            Thread.sleep(1000);

        }
        System.out.println("主线程结束");

    }
}
class Hi implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {


            System.out.println("hello"+i);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("子线程结束");


    }
}
