package com.rukman.verizon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Verizongrocery {

	public static void main(String[] args) {
		SpringApplication.run(Verizongrocery.class, args);
	}

}
