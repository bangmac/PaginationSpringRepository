package com.bm.cms.service;

import com.bm.cms.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);

    Page<Customer> findAll(Pageable pageable);

    Customer findOne(Long id);

    void save(Customer customer);

    void remove (Long id);
}
