package com.gspdu.tankgame03;

public class shot implements Runnable{
    int x;
    int y;
    int direct;
    int speed=2;
    boolean islive = true;

    public shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {
        while (true){

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            switch (direct){
                case 0:
                    y-=speed;
                    break;
                case 1:
                    y+=speed;
                    break;
                case 2:
                    x-=speed;
                    break;
                case 3:
                    x+=speed;
                    break;
            }
            System.out.println("子弹x=" +x +"y=" +y);
            if (!(x >=0&&x <= 1000&&y>=0&&y<=750)){
                islive = false;
                break;
            }
        }
    }
}
