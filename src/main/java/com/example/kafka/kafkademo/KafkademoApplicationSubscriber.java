package com.example.kafka.kafkademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application_subscriber.properties")
public class KafkademoApplicationSubscriber {

	public static void main(String[] args) {
		SpringApplication.run(KafkademoApplicationSubscriber.class, args);
	}

}
