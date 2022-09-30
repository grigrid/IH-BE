package com.day28;

import java.util.HashMap;
import java.util.Map;

public class Main {
/*Create an Account class with name, address, balance, and accountNumber properties with getters and setters.
In your Account class add a Hold enum. The Hold state should indicate if there is a reason for placing a hold on theAccount.
The potential Hold states are NONE, FRAUD, DELINQUENCY, LOST_STOLEN, LITIGATION_HOLD, FREERIDING.

In your main class, create 5 accounts and add them to a hash map with the name as the key*/
    public static void main(String[] args) {

        Map<String, Account> accountsList = new HashMap<>();

        Account account1 = new Account("Ingrid", "BCN", 12.0, "ES123", Status.FREERIDING);
        Account account2 = new Account("Richard", "BCN", 13.0, "ES423", Status.FRAUD);
        Account account3 = new Account("Ale", "BCN", 14.0, "ES5234", Status.NONE);

        accountsList.put(account1.getName(), account1);
        accountsList.put(account2.getName(), account2);
        accountsList.put(account3.getName(), account3);

        System.out.println(accountsList.get(account1.getName()).getBalance());
        System.out.println(accountsList.get("Ingrid").getName());

        System.out.println("-----------------");
        for (Account a : accountsList.values()) {
            System.out.println(a.getName());
        }
        System.out.println("-----------------");
        for (String a : accountsList.keySet()) {
            System.out.println(a);

        }


    }
}
