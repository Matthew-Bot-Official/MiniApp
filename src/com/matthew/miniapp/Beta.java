package com.matthew.miniapp;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Beta {

    public static void main(String[] args) {

        if (Launcher.activated == false) {
            activator.main(null);
        }

        JFrame window = new JFrame();
        window.setTitle("Beta");
        window.setSize(420,420);
        window.setVisible(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(new Color(0, 0,255));

        ImageIcon icon = new ImageIcon("icon.png");
        window.setIconImage(icon.getImage());
    }
}