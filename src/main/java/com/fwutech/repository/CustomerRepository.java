package com.fwutech.repository;

import java.util.List;

import com.fwutech.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}