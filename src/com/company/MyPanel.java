package com.company;

import javax.swing.*;
import java.awt.*;
// MyPanel extends JPanel, which will eventually be placed in a JFrame
public class MyPanel extends JPanel {
    Integer xcord,ycord,zcord,qcord;

    public MyPanel(Integer x, Integer y, Integer z, Integer q) {
        xcord  = x;
        ycord = y;
        zcord = z;
        qcord = q;
    }



    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.blue);
        g2.fillRect(xcord,ycord,zcord,qcord);
    } 
}