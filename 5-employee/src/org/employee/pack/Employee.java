package org.employee.pack;

public class Employee {
    private String name;
    double salary;
    private int workHours, hireYear;

    Employee(int hireYear, int workHours, double salary, String name) {
        this.hireYear = hireYear;
        this.workHours = workHours;
        this.salary = salary;
        this.name = name;
    }

    public double tax() {
        if (this.salary >= 1000) {
            return salary * 0.03;
        }
        return 0.0;
    }
    
    public double bonus() {
        int extraHours = this.workHours - 40;
        if (extraHours > 0) {
            return extraHours * 30;
        }
        return 0.0;
    }

    public double increase() {
        int year = 2020-this.hireYear;
        if (year < 10) {
            return this.salary * 0.05;
        } else if (year >= 10 && year < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    public void toString(Employee emp) {
        System.out.println("Tax: "+ emp.tax());
        System.out.println("Bonus: "+ emp.bonus());
        System.out.println("Increase Salary: "+ emp.increase());
        double totalSalary = emp.salary + emp.bonus() - emp.tax();
        System.out.println("Total Salary: "+ totalSalary);
        System.out.println("Total Salary with the raise of salary: "+ (emp.salary+ emp.increase()));
    }

}
