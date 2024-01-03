package com.example.customermanagement.controller;

import com.example.customermanagement.model.entity.Customer;
import com.example.customermanagement.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/customers")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("customer/list");
        List<Customer> customers = customerService.findAll();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @PostMapping ("/info")
    public ModelAndView info(@RequestParam("id") int id) {
        ModelAndView modelAndView = new ModelAndView("customer/info");
        Customer customer = customerService.findById(id);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }
}
