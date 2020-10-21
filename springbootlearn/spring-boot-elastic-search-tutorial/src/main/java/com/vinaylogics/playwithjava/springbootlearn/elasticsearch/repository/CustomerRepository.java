package com.vinaylogics.playwithjava.springbootlearn.elasticsearch.repository;

import com.vinaylogics.playwithjava.springbootlearn.elasticsearch.model.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface CustomerRepository extends ElasticsearchRepository<Customer,String> {

    List<Customer> findByFirstName(String firstName);
}
