package com.axelsmidt.javarefresher.chapter3;

import javax.swing.JOptionPane;

public class NameDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, String.format("Welcome, %s, to Java Programming!", name));
//        String message = String.format("Welcome, %s, to Java Programming!", name);
//        JOptionPane.showMessageDialog(null, message, name));
    }
}
