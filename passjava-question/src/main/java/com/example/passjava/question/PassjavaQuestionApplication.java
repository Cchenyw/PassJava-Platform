package com.example.passjava.question;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.example.passjava.question.dao")
@EnableDiscoveryClient
public class PassjavaQuestionApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassjavaQuestionApplication.class, args);
	}

}
