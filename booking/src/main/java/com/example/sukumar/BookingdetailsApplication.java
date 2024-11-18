package com.example.sukumar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class BookingdetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingdetailsApplication.class, args);
	}

}
