package com.day22sept.interfacesexercise.classes;

import com.day22sept.interfacesexercise.interfaces.TransactionList;
import com.day22sept.interfacesexercise.objects.Transaction;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class PaymentList implements TransactionList {
    private  List<Transaction> listTransactions = new ArrayList<>();

    public Transaction getLastTransaction() {
        return  listTransactions.get(listTransactions.size()-1);
    }

    public void addTransaction(Transaction transaction) {
        listTransactions.add(transaction);
    }

    public Transaction getTransactionByDate(LocalDate date) {
        for(Transaction t : listTransactions){
            if(date.equals(t.getDate()))
                return t;
        }
        return null;
    }

    public List<Transaction> getAllTransactions() {
        return listTransactions;
    }
}
