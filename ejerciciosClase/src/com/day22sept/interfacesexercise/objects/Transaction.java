package com.day22sept.interfacesexercise.objects;

import java.time.LocalDate;

public class Transaction {
    private int sellerAccountNumber;
    private int buyerAccountNumber;
    private double amount;
    private LocalDate date;

    public Transaction(int sellerAccountNumber, int buyerAccountNumber, double amount, LocalDate date) {
        setSellerAccountNumber(sellerAccountNumber);;
        setBuyerAccountNumber(buyerAccountNumber);
        setAmount(amount);
        this.date = LocalDate.now();
        setDate(date);
    }

    public void setSellerAccountNumber(int sellerAccountNumber) {
        this.sellerAccountNumber = sellerAccountNumber;
    }

    public void setBuyerAccountNumber(int buyerAccountNumber) {
        this.buyerAccountNumber = buyerAccountNumber;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getSellerAccountNumber() {
        return sellerAccountNumber;
    }

    public int getBuyerAccountNumber() {
        return buyerAccountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }
}
