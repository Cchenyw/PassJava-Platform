package com.example.passjava.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients(basePackages = "com.example.passjava.member.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class PassjavaMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassjavaMemberApplication.class, args);
	}

}
