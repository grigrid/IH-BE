package com.day22sept.interfacesexercise.interfaces;
import com.day22sept.interfacesexercise.objects.Transaction;

import java.time.LocalDate;
import java.util.List;

public interface TransactionList {

    Transaction getLastTransaction();
    void addTransaction(Transaction transaction);
    Transaction getTransactionByDate(LocalDate date);
    List<Transaction> getAllTransactions();
}
