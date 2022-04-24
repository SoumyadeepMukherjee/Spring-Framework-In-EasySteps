package com.soumyadeep.spring.springcoreadvanced.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    @Autowired(required = false)
    @Qualifier("address123")
    private Address address;

    Employee(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee [address=" + address + "]";
    }

}