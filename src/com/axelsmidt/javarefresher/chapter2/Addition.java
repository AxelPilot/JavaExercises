package com.axelsmidt.javarefresher.chapter2;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;
        int sum;

        System.out.print("Enter first integer: "); // Prompt
        try {
            number1 = input.nextInt();
        } catch (Exception e) {
            System.out.println("You must enter an integer!");
        }

        System.out.print("Enter second integer: "); // Prompt
        try {
            number2 = input.nextInt();
        } catch (Exception e) {
            System.out.println("You must enter an integer!");
        }

        sum = number1 + number2; // Add the numbers, then store the total in sum

        System.out.printf("Sum is %d%n", sum); // Display sum
    }
}
