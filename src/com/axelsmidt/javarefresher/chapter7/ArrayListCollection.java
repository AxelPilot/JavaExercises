package com.axelsmidt.javarefresher.chapter7;

import java.util.ArrayList;

public class ArrayListCollection {

    public static void main(String[] args) {
        // Create a new ArrayList of Strings with an initial capacity of 10
        ArrayList<String> items = new ArrayList<>();

        items.add("red");
        items.add(0, "yellow");

        // Header
        System.out.print("Display list of contents with counter-controlled loop:");

        // Display the colors in the list
        for (String item : items) System.out.printf(" %s", item);

        // Display colors using enhanced for in the display method
        display(items, "%nDisplay list contents with enhanced for statement:");
    }

    public static void display(ArrayList<String> items, String header) {
        System.out.printf(header); // Display header

        // Display each element in items
        for (String item : items)
            System.out.printf(" %s", item);

        System.out.println();
    }
}
