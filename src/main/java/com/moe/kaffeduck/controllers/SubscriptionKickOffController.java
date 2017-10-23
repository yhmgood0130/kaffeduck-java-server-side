package com.moe.kaffeduck.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.moe.kaffeduck.entities.Subscription;
import com.moe.kaffeduck.repos.SubscriptionRepository;

@RepositoryRestController
@RequestMapping("/subscriptions")
public class SubscriptionKickOffController {
	
	@Autowired
	private SubscriptionRepository subscriptionRepository;

	@PostMapping("/ship/{id}")
	public ResponseEntity ship(@PathVariable Long id) {
		
		Subscription subscription = subscriptionRepository.findOne(id);
		
		if(subscription == null) {
			throw new ResourceNotFoundException();
		}
		
		subscription.setShipped(true);
		subscriptionRepository.save(subscription);
		
		return ResponseEntity.ok("Item has been shipped");
	}
}
