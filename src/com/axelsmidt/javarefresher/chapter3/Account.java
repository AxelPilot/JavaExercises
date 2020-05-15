package com.axelsmidt.javarefresher.chapter3;

public class Account {
    private String name;
    private double balance;

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
        balance =+ amount;
    }

    public void withdraw(double amount) {
        balance =- amount;
    }
} // end class Account
