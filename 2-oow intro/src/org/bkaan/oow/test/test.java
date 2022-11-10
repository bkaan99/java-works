package org.bkaan.oow.test;

import org.bkaan.oow.domain.Employee;

public class test {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        var salary = e1.calculateSalary();
        System.out.println(salary);
    }
}

