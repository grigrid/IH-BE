package com.day26sept;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private String id;
    private double total;
    private boolean isPaid;
    private List<com.day26sept.InvoiceItems> items;

    public Invoice(String id, double total, boolean isPaid, List<InvoiceItems> items) {
        setId(id);
        setTotal(total);
        setPaid(isPaid);
        setItems(items);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public List<InvoiceItems> getItems() {
        return items;
    }

    public void setItems(List<InvoiceItems> items) {
        this.items = items;
    }
}
