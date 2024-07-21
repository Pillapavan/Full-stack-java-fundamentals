package com.java.Streams;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
     private List<Employee> employeelist;
     public EmployeeRepository(){
         this.employeelist =new ArrayList<>();
         employeelist.add(new Employee(1, "Alice", 60000, "Engineering"));
         employeelist.add(new Employee(2, "Bob", 55000, "Marketing"));
         employeelist.add(new Employee(3, "Charlie", 50000, "Sales"));
         employeelist.add(new Employee(4, "David", 70000, "Engineering"));
         employeelist.add(new Employee(5, "Eve", 65000, "HR"));
         employeelist.add(new Employee(6, "Frank", 45000, "Marketing"));
         employeelist.add(new Employee(7, "Grace", 75000, "Engineering"));
         employeelist.add(new Employee(8, "Hank", 48000, "Sales"));
         employeelist.add(new Employee(9, "Ivy", 52000, "HR"));
         employeelist.add(new Employee(10, "Jack", 58000, "Engineering"));
         employeelist.add(new Employee(1, "pavan", 60000, "Engineering"));
     }

    public List<Employee> getEmployees(){
        return this.employeelist;
    }


}
