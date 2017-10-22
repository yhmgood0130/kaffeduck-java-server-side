package com.moe.kaffeduck.repos;

import org.springframework.data.repository.CrudRepository;

import com.moe.kaffeduck.entities.Coffee;

public interface CoffeeRepository extends CrudRepository<Coffee, Long> {

}
