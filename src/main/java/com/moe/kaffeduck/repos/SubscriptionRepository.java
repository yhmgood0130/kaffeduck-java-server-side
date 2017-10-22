package com.moe.kaffeduck.repos;

import org.springframework.data.repository.CrudRepository;

import com.moe.kaffeduck.entities.Subscription;

public interface SubscriptionRepository extends CrudRepository<Subscription, Long> {

}
