package com.java.Collections.Sets;

import java.util.LinkedHashSet;
import java.util.LinkedList;

//LinkedHashSet is a hash table and linked list implementation of the Set interface, with predictable
//iteration order
public class LinkedHashSetExample {
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

        LinkedHashSet<Customer> linkedhashset=new LinkedHashSet<>();
        linkedhashset.add(customer1);
        linkedhashset.add(customer2);
        linkedhashset.add(customer3);
        linkedhashset.add(customer4);

        System.out.println(linkedhashset.size());
        System.out.println(linkedhashset);
    }
}
