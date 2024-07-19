package com.java.Collections.Sets;

import java.util.Objects;

public class Customer implements Comparable<Customer> {
    private String name;
    private int id;

    public Customer() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public int compareTo(Customer o) {
        //return this.name.compareTo(o.getName());
        return this.id - o.id;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
