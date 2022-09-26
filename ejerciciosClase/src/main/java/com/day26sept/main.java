package com.day26sept;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<InvoiceItems> items = new ArrayList<>();

        InvoiceItems items1 = new InvoiceItems("Cocacola", 10.20);
        InvoiceItems items2 = new InvoiceItems("fanta", 10.30);


        items.addAll(List.of(items1, items2));
        Invoice nota = new Invoice("A12", 12.9, false, items);

    }

}
