package com.java.Collections.Lists;

import java.util.LinkedList;

/*LinkedList is a doubly-linked list implementation of the List and Deque interfaces. It allows fast
insertion and deletion but slower random access*/
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Customer> linkedList=new LinkedList<>();

        Customer customer1=new Customer("Pavan",18);
        Customer customer2=new Customer("tataji",19);

        linkedList.add(customer1);
        linkedList.add(customer2);

        System.out.println(linkedList);

    }
}
