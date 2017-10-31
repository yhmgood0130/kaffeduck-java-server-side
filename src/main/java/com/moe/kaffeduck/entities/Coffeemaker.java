package com.moe.kaffeduck.entities;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"resourceId"})
@Entity
public class Coffeemaker extends AbstractEntity {
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private Float price;
	@Column(nullable=false)
	private String description;
	@Column(nullable=false)
	private String url;
	@OneToMany(mappedBy = "coffeemaker")
	private Set<Subscription> subscription;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Set<Subscription> getSubscription() {
		return subscription;
	}
	public void setSubscription(Set<Subscription> subscription) {
		this.subscription = subscription;
	}
	
	@Override
	public boolean equals(Object obj) {
		return Objects.equals(id, ((Coffeemaker) obj).id);
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	public Long getResourceId() {
		return this.id;
	}
}
