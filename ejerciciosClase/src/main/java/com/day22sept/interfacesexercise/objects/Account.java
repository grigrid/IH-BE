package com.day22sept.interfacesexercise.objects;

public class Account {
    private String name;
    private String address;
    private int accountNumber;
    private double balance;

    public Account(String name, String address, int accountNumber, double balance) {
         setName(name);
         setAddress(address);
         setAccountNumber(accountNumber);
         setBalance(balance);
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

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
