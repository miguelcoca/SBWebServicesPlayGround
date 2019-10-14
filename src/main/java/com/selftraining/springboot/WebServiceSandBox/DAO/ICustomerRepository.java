package com.selftraining.springboot.WebServiceSandBox.DAO;

import com.selftraining.springboot.WebServiceSandBox.JavaObjectEntities.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Integer> {
}
