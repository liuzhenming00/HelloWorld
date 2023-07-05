package com.hspedu.Homework;

public class Homework02 {
    public static void main(String[] args) {
        T t = new T();
        new Thread(t).start();
        new Thread(t).start();
    }
}

class T implements Runnable{
    private int  money = 10000;
    @Override
    public void run() {
        while (true){
            synchronized (this) {
                if (money < 1000) {
                    break;

                }
                money -= 1000;
                System.out.println(Thread.currentThread().getName() + "取出了1000," + "余额为" + money);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}