package com.java.Collections.Sets;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Customer customer1;
        customer1 = new Customer();
        customer1.setName("pavan");
        customer1.setId(3);
        Customer customer2;
        customer2 = new Customer();
        customer2.setName("tataji");
        customer2.setId(4);
        Customer customer3;
        customer3 = new Customer();
        customer3.setName("praveen");
        customer3.setId(2);
        Customer customer4;
        customer4=new Customer();
        customer4.setName("praveen");
        customer4.setId(1);

        TreeSet<Customer> treeSet =new TreeSet<>();
        treeSet.add(customer1);
        treeSet.add(customer2);
        treeSet.add(customer3);
        treeSet.add(customer4);

        System.out.println("Treeset:"+treeSet);
    }

}
