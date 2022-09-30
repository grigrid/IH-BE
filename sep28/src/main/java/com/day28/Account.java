package com.day28;

import jdk.jshell.Snippet;

public class Account {
    private String name;
    private String address;
    private double balance;
    private String accountNumber;

    private Status status;

    public Account(String name, String address, double balance, String accountNumber, Status status) {
        this.name = name;
        this.address = address;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


}
