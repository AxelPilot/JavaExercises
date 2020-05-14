package com.axelsmidt.javarefresher.chapter2;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.print("Enter first integer: "); // Prompt
        number1 = input.nextInt();

        System.out.print("Enter second integer: "); // Prompt
        number2 = input.nextInt();

        sum = number1 + number2; // Add the numbers, then store the total in sum

        System.out.printf("Sum is %d%n", sum); // Display sum
    }
}
