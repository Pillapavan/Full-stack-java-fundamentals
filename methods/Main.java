package com.java.methods;

public class Main {
    public static void main(String[] args) {
        //car class properties
        Car myCar;
        myCar= new Car();
        myCar.Brand="Tata";
        myCar.Model="frontier";
        myCar.Year=2020;
        myCar.Price=2000000;
        myCar.Color="Blue";
        //method calling
        myCar.displayInfo();

        System.out.println();


        //Circle class properties
        Circle circle;
        circle=new Circle();
        circle.Radius=3.5;
        circle.Color="blue";
        circle.displayInfo();

        System.out.println();

        //BankAccount properties
        BankAccount Customer;
        Customer=new BankAccount();
        Customer.accountNumber="23234855436";
        Customer.accountHolderName="praveen";
        Customer.Balance=3000.45;

        //methods calling
        //deposit
        Customer.deposit(30000);
        Customer.displayInfo();

        //withdraw
        Customer.withdraw(2000);
        Customer.displayInfo();

    }


}
