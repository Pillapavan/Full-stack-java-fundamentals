package com.java.Collections.maps;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class HashmapExample {
    public static void main(String[] args) {
        HashMap<Integer,Customer> hashMap=new HashMap<>();

      Customer customer1;
        customer1 = new Customer("pavan");
       Customer customer2;
       customer2=new Customer("tataji");
       Customer customer3;
       customer3=new Customer("praveen");

       hashMap.put(111,customer1);
       hashMap.put(222,customer2);
       hashMap.put(333,customer3);
        System.out.println(hashMap);


        hashMap.put(222,new Customer("balu"));
        hashMap.remove(333);
       //// Iterating over entrySet
       for (Map.Entry<Integer, Customer> entry: hashMap.entrySet()){

           System.out.println("Integer:"+ entry.getKey()+"  Customer:"+entry.getValue());

       }
       /*
        // Iterating over values
        for (Customer value : hashMap.values()) {
            System.out.println("Value: " + value);
        }

        // Iterating over keySet
        for (Integer key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }*/
        int studentIDToSearch= 222;
        if (hashMap.containsKey(studentIDToSearch)) {
            System.out.println("Student found");
        } else {
            System.out.println("Student not found");
        }

    }

}
