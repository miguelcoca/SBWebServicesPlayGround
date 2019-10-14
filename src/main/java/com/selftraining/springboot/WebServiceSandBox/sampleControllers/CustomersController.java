package com.selftraining.springboot.WebServiceSandBox.sampleControllers;


import com.selftraining.springboot.WebServiceSandBox.JavaObjectEntities.Customer;
import com.selftraining.springboot.WebServiceSandBox.Services.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {

    @Autowired
    private CustomersService customersService;

    @RequestMapping( value = "/getCustomers", method = RequestMethod.GET)
    public Iterable<Customer> getAllCustomers(@RequestParam(name = "_pageNumber", defaultValue = "0") Integer pageNumber,
                                              @RequestParam(name = "_pageSize", defaultValue = "10") Integer pageSize){
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return customersService.getAllCustomers(pageable);

    }

    @RequestMapping(value = "/customer/{id}")
    public Optional<Customer> getCustomerWithID(@PathVariable(value = "id") String id){
        return customersService.getCustomerWithID(id);
    }
}
