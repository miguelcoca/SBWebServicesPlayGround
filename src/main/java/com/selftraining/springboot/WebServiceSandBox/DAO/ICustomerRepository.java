package com.selftraining.springboot.WebServiceSandBox.DAO;

import com.selftraining.springboot.WebServiceSandBox.JavaObjectEntities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends CrudRepository<Customer, Integer> {
}
