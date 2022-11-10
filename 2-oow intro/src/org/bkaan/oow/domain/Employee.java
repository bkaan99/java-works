package org.bkaan.oow.domain;

public class Employee {
    int no;
    String name;
    double salary;
    int year;

    public void work() {
        System.out.println("Working" + name + "is working.");
    }
    public double calculateSalary() {
        salary = year * 1000;
        return salary;
    }
}