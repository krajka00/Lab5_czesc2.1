package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
@SuppressWarnings("serial")

public class Framka extends JFrame implements MouseInputListener {



    public static void FramkaStart() {
        SwingUtilities.invokeLater(() -> {
            new Framka("Mouse teser").start();
        });
    }


    private void start() {
        setVisible(true);
    }


    public Framka() throws HeadlessException {
        this("untitled");
    }

    public Framka(String title) throws HeadlessException {
        super(title);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(760, 720);
        JFrame f = new JFrame();
        f.setBounds(0, 0, 760, 720);
        setLocationRelativeTo(null);
        f.setVisible(true);
        setFocusable(true);
        requestFocus();
        f.addMouseListener(this);
        f.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                MyPanel z;
                MyPanel2 p;

                if(e.getKeyCode() == KeyEvent.VK_K ){
                    Integer cordX = f.getMousePosition().x;
                    Integer cordY = f.getMousePosition().y;
                    z = new MyPanel(cordX-30, cordY-53, 50, 50);
                    f.add(z);
                    f.setVisible(true);
                }
                else if(e.getKeyCode() == KeyEvent.VK_O ){

                    Integer cordX = f.getMousePosition().x;
                    Integer cordY = f.getMousePosition().y;
                    p= new MyPanel2(cordX-33, cordY-55,50,50);
                    f.add(p);
                    f.setVisible(true);
                }

            }
        });






    }



    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}