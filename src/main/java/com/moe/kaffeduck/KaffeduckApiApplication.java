package com.moe.kaffeduck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.convert.Jsr310Converters;

@SpringBootApplication
@EntityScan(basePackageClasses= {KaffeduckApiApplication.class,Jsr310Converters.class})
public class KaffeduckApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(KaffeduckApiApplication.class, args);
	}
}
