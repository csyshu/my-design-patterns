package com.csy.design.visitor;

import java.util.ArrayList;
import java.util.List;

class CustomerGroup {

    private final List<Customer> customers = new ArrayList<>();

    void accept(Visitor visitor) {
        for (Customer customer : customers) {
            customer.accept(visitor);
        }
    }

    void addCustomer(Customer customer) {
        customers.add(customer);
    }
}