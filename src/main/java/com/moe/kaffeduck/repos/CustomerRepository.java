package com.moe.kaffeduck.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.moe.kaffeduck.entities.Customer;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

}
