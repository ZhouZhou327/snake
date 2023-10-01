package com.zhou;

import javax.swing.*;
import java.awt.*;

public class GameWin extends JFrame {

    public void launch() {
        //set the window is visible
        this.setVisible(true);
        //set the window size
        this.setSize(600,600);
        //set the window location
        this.setLocationRelativeTo(null);
        //set the window title
        this.setTitle("The Snake Game");
    }

    public void paint(Graphics g){
        //set background colour
        g.setColor(Color.GRAY);
        g.fillRect(0,0,600,600);
        //set line
        g.setColor(Color.BLACK);
        for (int i = 0; i < 20; i++) {
            g.drawLine(0,i*30,600,i*30);
            g.drawLine(i*30,0,i*30,600);
        }
    }

    public static void main(String[] args) {
        GameWin gameWin = new GameWin();
        gameWin.launch();
    }
}