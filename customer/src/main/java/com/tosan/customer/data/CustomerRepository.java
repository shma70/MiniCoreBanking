package com.tosan.customer.data;


import com.tosan.customer.model.Customer;
import com.tosan.customer.model.CustomerStatus;
import com.tosan.customer.model.CustomerType;
import com.tosan.customer.model.NationalCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Transactional
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findCustomerByNationalCode(NationalCode nationalCode);

    Customer deleteById();

    void saveAll();

    List<Customer> findCustomersByCustomerCode(Long customerCode);

    List<Customer> findCustomersByFirstNameAndLastName(String firstName, String lastName);

    List<Customer> findCustomersByNationalCode(NationalCode nationalCode);

    List<Customer> findCustomersByDateOfBirthday(Date dateOfBirthday);

    List<Customer> findCustomersByCustomerStatus(CustomerStatus customerStatus);

    List<Customer> findCustomersByCustomerType(CustomerType customerType);

    List<Customer> findCustomersByPhoneNumber(Long phoneNumber);

    List<Customer> findCustomersByCustomerDefinitionDate(Date customerDefinitionDate);
}
