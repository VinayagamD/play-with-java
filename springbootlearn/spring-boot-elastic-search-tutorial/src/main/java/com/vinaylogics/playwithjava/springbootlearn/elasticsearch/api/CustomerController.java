package com.vinaylogics.playwithjava.springbootlearn.elasticsearch.api;

import com.vinaylogics.playwithjava.springbootlearn.elasticsearch.model.Customer;
import com.vinaylogics.playwithjava.springbootlearn.elasticsearch.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Integer saveCustomer(@RequestBody List<Customer> customers){
        repository.saveAll(customers);
        return customers.size();
    }

    @GetMapping
    public Iterable<Customer> findAllCustomers(){
        return repository.findAll();
    }

    @GetMapping("/findByFName/{firstName}")
    public List<Customer> findByFirstName(@PathVariable String firstName){
        return repository.findByFirstName(firstName);
    }

}
