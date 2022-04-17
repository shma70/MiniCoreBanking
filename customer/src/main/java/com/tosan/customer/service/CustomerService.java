package com.tosan.customer.service;

import com.tosan.customer.data.CustomerRepository;
import com.tosan.customer.model.Customer;
import com.tosan.customer.model.CustomerStatus;
import com.tosan.customer.model.CustomerType;
import com.tosan.customer.model.NationalCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Transactional
@Service
public class CustomerService<nationalCode> {

    public Object getCustomerByNationalCode;
    @Autowired
    private CustomerRepository repository;

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    public List<Customer> createCustomer() {
        Integer nationalCode = null;
        List<Customer> customers = new ArrayList<>(getCustomerByNationalCode(nationalCode));
        customers.addAll(repository.findAll());
        return customers;
    }

    public Integer getCustomerByNationalCode(Integer nationalCode) {
        return nationalCode;
    }


    @Transactional
    public Customer save(Customer customer) {
        Customer customer1 = repository.save(customer);
        failure();
        return customer;
    }

    private void failure() {
        throw new RuntimeException("failed to create new customer");
    }

    public NationalCode getCustomerByNationalCode(NationalCode nationalCode) {
        return repository.findCustomerByNationalCode(nationalCode).getNationalCode();
    }

    public Customer deposits(NationalCode nationalCode) {
        getDepositsCustomer();
        Object DepositsCustomer = new Object();
        return repository.deleteById();
    }

    private void getDepositsCustomer() {
    }

    public void update(Long id, Long customerCode, String firstName, String lastName, NationalCode nationalCode, Date dateOfBirthday, CustomerStatus customerStatus, CustomerType customerType, Long phoneNumber) {
        repository.saveAll();
    }
}
