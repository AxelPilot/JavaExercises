package com.axelsmidt.javarefresher.chapter3;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String theName = input.nextLine();
        Account myAccount = new Account(theName);

        System.out.printf("The name of the account holder is: %s%n%n", myAccount.getName());
    }
} // end class AccountTest
