package com.moe.kaffeduck.repos;

//import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.moe.kaffeduck.entities.Coffeemaker;

public interface CoffeemakerRepository extends PagingAndSortingRepository<Coffeemaker, Long> {
	Page <Coffeemaker> findByName(@Param("name") String name, Pageable pageable);
	Page <Coffeemaker> findByPrice(@Param("price") Float price, Pageable pageable);
}
