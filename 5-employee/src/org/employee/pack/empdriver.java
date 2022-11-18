package org.employee.pack;

public class empdriver {

   public static void main(String[] args) {
    Employee emp1 = new Employee(1985, 45, 2000, "Ali");
    /* 
    System.out.println("Tax: "+ emp1.tax());
    System.out.println("Bonus: "+ emp1.bonus());
    System.out.println("Increase Salary: "+ emp1.increase());
    */
    /*double totalSalary = emp1.salary + emp1.bonus() + emp1.increase() - emp1.tax();
    System.out.println("Total Salary: "+ totalSalary);*/
    emp1.toString(emp1) ;
    
   }
}
