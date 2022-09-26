package com.day23sept.Exam;

import java.math.BigDecimal;
public class SalesPerson extends Employee{
private double commissionRate;

    public SalesPerson(String name, BigDecimal salary, Employee supervisor, double commissionRate) {
        super(name, salary, supervisor);
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
       setCommissionRate(commissionRate);
    }
}
