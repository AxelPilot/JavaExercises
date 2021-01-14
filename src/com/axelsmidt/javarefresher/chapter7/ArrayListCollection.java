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
        for (int i = 0; i < items.size(); i++)
            System.out.printf(" %s", items.get(i));

        // Display colors using enhanced for in the display method
        display(items, "%nDisplay list contents with enhanced for statement:");

        items.add("green"); // Add "green" to the end of the list
        items.add("yellow"); // Add "yellow" to the end of the list
        display(items, "List with two new elements:");

        items.remove("yellow"); // Remove the first "yellow"
        display(items, "Remove first instance of yellow:");

        items.remove(1); // Remove item at index 1
        display(items, "Remove second list element (green):");

        // Check if a value is in the List
        System.out.printf("\"red\" is %sin the list%n", items.contains("red") ? "" : "not ");

        // Display number of elements in the List
        System.out.printf("Size: %s%n", items.size());
    }

    public static void display(ArrayList<String> items, String header) {
        System.out.printf(header); // Display header

        // Display each element in items
        for (String item : items)
            System.out.printf(" %s", item);

        System.out.println();
    }
}
