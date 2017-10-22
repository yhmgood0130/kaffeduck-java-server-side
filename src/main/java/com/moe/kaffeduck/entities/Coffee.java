package com.moe.kaffeduck.entities;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Coffee extends AbstractEntity {
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private String type;
	@Column(nullable=false)
	private Float price;
	@Column(nullable=false)
	private Float size;
	@OneToMany(mappedBy = "coffee")
	private Set<Subscription> subscription;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Float getSize() {
		return size;
	}
	public void setSize(Float size) {
		this.size = size;
	}
	public Set<Subscription> getSubscription() {
		return subscription;
	}
	public void setSubscription(Set<Subscription> subscription) {
		this.subscription = subscription;
	}
	
	@Override
	public boolean equals(Object obj) {
		return Objects.equals(id, ((Coffee) obj).id);
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
