package com.selftraining.springboot.WebServiceSandBox.sampleControllers;


import com.selftraining.springboot.WebServiceSandBox.JavaObjectEntities.Customer;
import com.selftraining.springboot.WebServiceSandBox.Services.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {

    @Autowired
    private CustomersService customersService;

    @RequestMapping(value = "/addNewCustomer", method = RequestMethod.POST)
    public ResponseEntity<?> addNewCustomer(@RequestBody Customer customer){

        Customer createdCustomer = customersService.addNewCustomer(customer);

        if(createdCustomer.getId() > 0) {
            return ResponseEntity.ok(createdCustomer);
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(customer);
    }

    @RequestMapping( value = "/getCustomers", method = RequestMethod.GET)
    public Iterable<Customer> getAllCustomers(@RequestParam(name = "_pageNumber", defaultValue = "0") Integer pageNumber,
                                              @RequestParam(name = "_pageSize", defaultValue = "10") Integer pageSize){
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return customersService.getAllCustomers(pageable);

    }

    @RequestMapping(value = "/customer/{id}")
    public ResponseEntity<?> getCustomerWithID(@PathVariable(value = "id") String id){
        Optional<Customer> customerWithID = customersService.getCustomerWithID(id);

        try{
             return ResponseEntity.ok(customerWithID.get());
         }catch (NoSuchElementException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
}
