package com.moe.kaffeduck.repos;

//import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.moe.kaffeduck.entities.Coffee;

public interface CoffeeRepository extends PagingAndSortingRepository<Coffee, Long> {
	Page <Coffee> findByName(@Param("name") String name, Pageable pageable);
	Page <Coffee> findByNameAndSize(@Param("name") String name, @Param("size") Float size, Pageable pageable);
}
