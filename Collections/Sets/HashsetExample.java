package com.java.Collections.Sets;

import java.util.HashSet;
//HashSet is a hash table-based implementation of the Set interface. It does not guarantee any order of
//the elements.

public class HashsetExample {
    public static void main(String[] args) {
        Customer customer1;
        customer1 = new Customer();
        customer1.setName("pavan");
        customer1.setId(1);
        Customer customer2;
        customer2 = new Customer();
        customer2.setName("tataji");
        customer2.setId(2);
        Customer customer3;
        customer3 = new Customer();
        customer3.setName("praveen");
        customer3.setId(3);
        Customer customer4;
        customer4=new Customer();
        customer4.setName("praveen");
        customer4.setId(3);

        HashSet<Customer> hashSet=new HashSet<>();
        hashSet.add(customer1);
        hashSet.add(customer2);
        hashSet.add(customer3);
        hashSet.add(customer4);

        System.out.println(hashSet.size());

        for (Customer customer:hashSet){
            System.out.println(customer);
        }

        System.out.println();

        System.out.println(hashSet);

    }
}
