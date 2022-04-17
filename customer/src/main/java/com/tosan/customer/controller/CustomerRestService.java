package com.tosan.customer.controller;


import com.tosan.customer.model.Customer;
import com.tosan.customer.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Transactional
@RestController
@RequestMapping("/rest")
public class CustomerRestService {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/all")
    public List getAll() {
        return customerService.getAllCustomers();

    }

    @GetMapping("/customer")
    public Customer getByNationalCode() {
//Optional<Customer> customer = customerService.getAllCustomers().stream().filter(t -> t.getNationalCode()!=null&& t.getNationalCode().equals(nationalCode)).findFirst();
//        return customer.orElse((new Customer()));

        return (Customer) customerService.getCustomerByNationalCode;
    }


    @PostMapping("/create")
    public Customer create(@RequestBody Customer customer) {
        return customerService.save(customer);
    }


//    @GetMapping("/customer/{id}")
//    public Customer getCustomerById(@PathVariable("id") Long id) {
//        Optional customer;
//        customer = customerService.getAllCustomers().stream().filter(t -> t.equals(id)).findFirst();
//        customer = customerService.getCustomerByNationalCode(getById());
//        return customer;
//    }
}
