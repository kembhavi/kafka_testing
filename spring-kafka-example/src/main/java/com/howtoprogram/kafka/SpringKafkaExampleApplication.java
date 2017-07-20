package com.howtoprogram.kafka;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringKafkaExampleApplication {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringKafkaExampleApplication.class, args);
		System.out.println("Hit 'Enter' to terminate");
		System.in.read();
		//ctx.close();
		System.exit(0);
	}
}
