package com.moe.kaffeduck.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.moe.kaffeduck.entities.Subscription;

public interface SubscriptionRepository extends PagingAndSortingRepository<Subscription, Long> {

}
