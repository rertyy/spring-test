package com.example.gqltest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;



@Controller
public class BookController {
    @Autowired
    private CustomerRepository customerRepository;

    @QueryMapping
    public Customer bookByLastName(@Argument String lastName) {
        return customerRepository.findByLastName(lastName).get(0);
    }
}