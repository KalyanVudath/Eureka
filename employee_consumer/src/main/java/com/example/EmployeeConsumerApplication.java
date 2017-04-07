package com.example;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import com.example.controller.ConsumerControllerClient;

@SpringBootApplication
public class EmployeeConsumerApplication {

	public static void main(String[] args) throws RestClientException, IOException {
		SpringApplication.run(EmployeeConsumerApplication.class, args);
	}	
}
