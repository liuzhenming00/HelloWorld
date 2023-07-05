package com.hspedu;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame {
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }
    public DrawCircle(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
class MyPanel extends JPanel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // g.drawOval(10,10,100,100);
        //g.drawLine(10,10,100,100);
        //g.drawRect(10,10,100,100);
        //g.setColor(Color.BLUE);
        //g.fillRect(10,10,100,100);
//g.fillOval(10,10,100,100);
        //Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bb.jpg"));
        //g.drawImage(image,10,10,90,160,this);
        g.setColor(Color.red);
        g.setFont(new Font("隶书",Font.BOLD,50));
        g.drawString("北京你好",100,100);


    }
}