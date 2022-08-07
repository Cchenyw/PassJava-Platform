package com.example.passjava.channel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PassjavaChannelApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassjavaChannelApplication.class, args);
	}

}
