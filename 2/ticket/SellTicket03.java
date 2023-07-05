package com.hspedu.ticket;

import java.math.BigDecimal;

public class SellTicket03 implements Runnable{
    private  int ticketNum = 100;
    private Boolean loop = true;
public synchronized void sell(){
    if (ticketNum <= 0) {
        System.out.println("售票结束");
        loop = false;
        return;
    }
    System.out.println(Thread.currentThread().getName()+"售票一张"+(--ticketNum));
    try {
        Thread.sleep(1);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }
}
