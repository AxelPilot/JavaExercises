package com.axelsmidt.javarefresher.chapter3;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String theName = input.nextLine();
        System.out.println("Please enter your account balance:");
        double theBalance = input.nextDouble();
        Account myAccount = new Account(theName, theBalance);

        System.out.printf("The name of the account holder is: %s%n", myAccount.getName());
        System.out.printf("The account balance is: %f%n", myAccount.getBalance());
    }
} // end class AccountTest
