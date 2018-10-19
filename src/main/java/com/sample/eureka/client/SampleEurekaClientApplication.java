package com.sample.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SampleEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleEurekaClientApplication.class, args);
	}
}
