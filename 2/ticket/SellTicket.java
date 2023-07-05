package com.hspedu.ticket;

public class SellTicket {
    public static void main(String[] args) {
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();
        SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
    }
}
class SellTicket01 extends Thread{
    private static int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束");
                break;
            }
            System.out.println(Thread.currentThread().getName()+"售票一张"+(--ticketNum));
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class SellTicket02  implements Runnable{
    private  int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束");
                break;
            }
            System.out.println(Thread.currentThread().getName()+"售票一张"+(--ticketNum));
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
