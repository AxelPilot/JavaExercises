package com.axelsmidt.javarefresher.chapter5;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {
    public static void main(String[] args) {
        JFrame app = new JFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setBounds(200, 200, 600, 600);
        app.setVisible(true);

        int choice;

        do {
            // Obtain user's choice
            choice = Integer.parseInt(JOptionPane.showInputDialog("1: Rectangles\n2: Ovals\n3: Concentric circles\n-1: Exit"));

            // Create a panel based on the user's input
            Shapes panel = new Shapes(choice);

            app.add(panel);
            app.setVisible(true);
        } while (choice != -1);
    System.exit(0);
    }
}
