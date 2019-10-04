package com.selftraining.springboot.WebServiceSandBox.sampleControllers;


import com.selftraining.springboot.WebServiceSandBox.JavaObjectEntities.Customer;
import com.selftraining.springboot.WebServiceSandBox.Services.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {

    @Autowired
    private CustomersService customersService;

    @RequestMapping( value = "/getCustomers", method = RequestMethod.GET)
    public Iterable<Customer> getAllCustomers(){

        return customersService.getAllCustomers();

    }
}
