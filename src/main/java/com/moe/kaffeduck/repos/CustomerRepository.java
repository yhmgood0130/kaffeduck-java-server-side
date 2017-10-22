package com.moe.kaffeduck.repos;

import org.springframework.data.repository.CrudRepository;

import com.moe.kaffeduck.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
