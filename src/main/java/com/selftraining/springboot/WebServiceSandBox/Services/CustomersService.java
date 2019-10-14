package com.selftraining.springboot.WebServiceSandBox.Services;

import com.selftraining.springboot.WebServiceSandBox.DAO.ICustomerRepository;
import com.selftraining.springboot.WebServiceSandBox.JavaObjectEntities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomersService {

    @Autowired
    private ICustomerRepository customerRepository;

    public Iterable<Customer> getAllCustomers(Pageable pageable){
        return customerRepository.findAll(pageable);
    }

    public Optional<Customer> getCustomerWithID(String id) {
        return customerRepository.findById(Integer.parseInt(id));
    }
}
