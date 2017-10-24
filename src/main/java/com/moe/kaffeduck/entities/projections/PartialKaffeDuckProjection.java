package com.moe.kaffeduck.entities.projections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.moe.kaffeduck.entities.Customer;

@Projection(name="partial",types = { Customer.class })
public interface PartialKaffeDuckProjection {
	
	@Value("#{target.first_name} #{target.last_name}")
	String getFullName();
	@Value("#{target.street}, #{target.city}, #{target.state}, #{target.zipcode}")
	String getAddress();
	String getPhone_number();

}
