package com.selftraining.springboot.WebServiceSandBox.sampleControllers;


import com.selftraining.springboot.WebServiceSandBox.JavaObjectEntities.Customer;
import com.selftraining.springboot.WebServiceSandBox.Services.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {

    @Autowired
    private CustomersService customersService;

    @RequestMapping( value = "/getCustomers", method = RequestMethod.GET)
    public Iterable<Customer> getAllCustomers(){

        return customersService.getAllCustomers();

    }

    @RequestMapping(value = "/customer/{id}")
    public Optional<Customer> getCustomerWithID(@PathVariable(value = "id") String id){
        return customersService.getCustomerWithID(id);
    }
}
