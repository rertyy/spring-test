package com.example.gqltest;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Customer findById(long id);
    List<Customer> findByLastName(String lastName);

}
