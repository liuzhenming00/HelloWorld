package com.gspdu.tankgame4;

import java.util.Vector;

public class EnemyTank extends Tank {
    Vector<shot> shots = new Vector<>();
    public EnemyTank(int x, int y) {
        super(x, y);
    }
}
