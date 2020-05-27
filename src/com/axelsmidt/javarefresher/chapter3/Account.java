package com.axelsmidt.javarefresher.chapter3;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0) this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0.0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0.0) balance -= amount;
    }
} // end class Account
