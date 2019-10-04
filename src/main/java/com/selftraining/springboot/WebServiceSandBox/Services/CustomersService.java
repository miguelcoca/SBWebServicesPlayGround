package com.selftraining.springboot.WebServiceSandBox.Services;

import com.selftraining.springboot.WebServiceSandBox.DAO.ICustomerRepository;
import com.selftraining.springboot.WebServiceSandBox.JavaObjectEntities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomersService {

    @Autowired
    private ICustomerRepository customerRepository;

    public Iterable<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

}
