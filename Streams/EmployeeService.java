package com.java.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
    public EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> Details(){
        return this.employeeRepository.getEmployees();
    }

    //Terminal Operations
    public List<Employee>  removeDuplicates(){
        return  this.employeeRepository.getEmployees().stream().distinct().collect(Collectors.toList());
    }

    public List<Employee>  Limit(int max){
        return this.employeeRepository.getEmployees().stream().limit(max).collect(Collectors.toList());
    }

    public List<Employee>  Skip(int Start){
        return this.employeeRepository.getEmployees().stream().skip(Start).collect(Collectors.toList());
    }

    public List<Employee>  Log(){
        return this.employeeRepository.getEmployees().stream().filter(E -> E.getId()>2).peek(System.out::println).collect(Collectors.toList());
    }

    //Terminal Operations
    int  Count(){
        return (int) this.employeeRepository.getEmployees().stream().count();
    }

    boolean anyMatch(){
        return this.employeeRepository.getEmployees().stream().anyMatch(E->E.getSalary()>50000);
    }
    public List<String>  Map(){
        return this.employeeRepository.getEmployees().stream().map(Employee::getDepartment).collect(Collectors.toList());
    }


}
