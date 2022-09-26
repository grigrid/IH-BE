package com.day23sept.Exam;

import java.math.BigDecimal;

public class Employee {
    String name;
    BigDecimal salary;
    Employee supervisor;

    public Employee (String name, BigDecimal salary, Employee supervisor){
        this.name = name;
        this.salary = salary;
        this.supervisor = supervisor;
    }

    // getters, and setters omitted for brevity


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "\nname='" + name + '\'' +
                ", \nsalary=" + salary +
                ", \nsupervisor=" + supervisor +
                "\n}";
    }
}
