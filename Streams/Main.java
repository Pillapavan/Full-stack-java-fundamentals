package com.java.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        EmployeeRepository employeeRepository=new EmployeeRepository();
        EmployeeService employeeService=new EmployeeService(employeeRepository);
        /*
        List<Employee> employees=employeeService.Details();
        employees.forEach(System.out::println);*/

        //remove duplicates by id
        List<Employee>  Distinct = employeeService.removeDuplicates();
        Distinct.forEach(System.out::println);

        //get a fixed employee details
        List<Employee>  Fixed = employeeService.Limit(3);
        Fixed.forEach(System.out::println);

        //Skip first two employee details using skip
        List<Employee>  Start = employeeService.Skip(2);
        Start.forEach(System.out::println);

        System.out.println();

        List<Employee>  debug = employeeService.Log();
        debug.forEach(System.out::println);


        int Count = employeeService.Count();
        System.out.println(Count);


        System.out.println(employeeService.anyMatch());

        List<String>   dept= employeeService.Map();
        dept.forEach(System.out::println);


    }
}
