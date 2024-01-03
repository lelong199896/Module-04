package com.example.customermanagement.model.service;

import com.example.customermanagement.model.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    List<Customer> customerList = new ArrayList<>();

    public List<Customer> findAll() {
    customerList.add(new Customer(1, "Nguyen Khac Nhat", "nhat@codegym.vn", "Hà Nội"));
    customerList.add(new Customer(2, "Dang Huy Hoa", "hoa.dang@codegym.vn", "Đà Nẵng"));
    customerList.add(new Customer(3, "Le Thi Chau", "chau.le@codegym.vn", "Hà Nội"));
    customerList.add(new Customer(4, "Nguyen Thuy Duong", "duong.nguyen@codegym.vn", "Sài Gòn"));
    customerList.add(new Customer(5, "CodeGym", "codegym@codegym.vn", "Việt Nam"));
    return customerList;
    }

    public Customer findById(int id) {
        Customer customer = null;
        for (Customer customer1:
             customerList) {
            if (customer1.getId() == id) {
                customer = customer1;
            }
        }
        return customer;
    }

}
