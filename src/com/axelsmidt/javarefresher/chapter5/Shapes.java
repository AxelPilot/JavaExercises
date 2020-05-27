package com.axelsmidt.javarefresher.chapter5;

import javax.swing.JPanel;
import java.awt.Graphics;

public class Shapes extends JPanel {
    private int choice;

    public Shapes(int userChoice) {
        choice = userChoice;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        for (int i = 0; i < 25; i++) {
            switch (choice) {
                case 1: // draw rectangles
                    g.drawRect(10+i*10, 10+i*10, 50+i*10, 50+i*10);
                    break;
                case 2: // draw ovals
                    g.drawOval(10+i*10, 10+i*10, 50+i*10, 50+i*10);
                    break;
                case 3: // draw concentric circles
                    g.drawOval(centerX-(10+i*10), centerY-(10+i*10), (10+i*10)*2, (10+i*10)*2);
            }
        }
    }
}
