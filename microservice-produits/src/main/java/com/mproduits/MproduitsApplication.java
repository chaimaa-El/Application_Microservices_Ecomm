package com.mproduits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties
@EnableDiscoveryClient

public class MproduitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MproduitsApplication.class, args);
	}
}
