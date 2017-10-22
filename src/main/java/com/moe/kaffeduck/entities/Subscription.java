package com.moe.kaffeduck.entities;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Subscription extends AbstractEntity {
	
	@CreationTimestamp
	@Column(updatable = false)
	private Instant added;
	
	private ZonedDateTime delivery_time;
	private ZoneId zone_id;
	private Boolean shipped;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Coffee coffee;
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(nullable = false)
	private Customer customer;
	
	public Instant getAdded() {
		return added;
	}
	public void setAdded(Instant added) {
		this.added = added;
	}
	public ZonedDateTime getDelivery_time() {
		return delivery_time;
	}
	public void setDelivery_time(ZonedDateTime delivery_time) {
		this.delivery_time = delivery_time;
	}
	public ZoneId getZone_id() {
		return zone_id;
	}
	public void setZone_id(ZoneId zone_id) {
		this.zone_id = zone_id;
	}
	public Boolean getShipped() {
		return shipped;
	}
	public void setShipped(Boolean shipped) {
		this.shipped = shipped;
	}
	public Coffee getCoffee() {
		return coffee;
	}
	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public boolean equals(Object obj) {
		return Objects.equals(id, ((Subscription) obj).id);
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
}
