package com.gspdu.tankgame4;

public class Hero extends Tank {
com.gspdu.tankgame4.shot shot = null;
    public Hero(int x, int y) {
        super(x, y);
    }
    public void shotEnemyTank(){
        switch (getDirect()){
            case 0:
                shot = new shot(getX()+20,getY(),0);
                break;
            case 1:
                shot = new shot(getX()+20,getY()+60,1);
                break;
            case 2:
                shot = new shot(getX(),getY()+20,2);
                break;
            case 3:
                shot = new shot(getX()+60,getY()+20,3);
                break;
        }
        new Thread(shot).start();
    }

}
