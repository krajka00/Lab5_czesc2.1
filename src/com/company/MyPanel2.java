package com.company;

import javax.swing.*;
import java.awt.*;

public class MyPanel2 extends JPanel {
    Integer xcord,ycord,zcord,qcord;

    public MyPanel2(Integer x, Integer y, Integer z, Integer q) {
        xcord  = x;
        ycord = y;
        zcord = z;
        qcord = q;
    }



    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.red);
        g2.fillOval(xcord,ycord,zcord,qcord);


    }
}