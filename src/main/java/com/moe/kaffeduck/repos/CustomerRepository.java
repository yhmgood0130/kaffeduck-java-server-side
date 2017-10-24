package com.moe.kaffeduck.repos;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.moe.kaffeduck.entities.Customer;
import com.moe.kaffeduck.entities.projections.PartialKaffeDuckProjection;

@RepositoryRestResource(excerptProjection=PartialKaffeDuckProjection.class)
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

}
