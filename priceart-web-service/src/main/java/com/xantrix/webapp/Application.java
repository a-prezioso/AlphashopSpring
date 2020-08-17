package com.xantrix.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
 
@SpringBootApplication
@EnableCaching
@EnableDiscoveryClient
//@EnableHystrix
@EnableCircuitBreaker
public class Application 
{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
