package com.example.kafka.kafkademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application_publisher.properties")
public class KafkademoApplicationPublisher {

	public static void main(String[] args) {
		SpringApplication.run(KafkademoApplicationPublisher.class, args);
	}

}
