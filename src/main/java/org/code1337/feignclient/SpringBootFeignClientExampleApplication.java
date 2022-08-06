package org.code1337.feignclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@Slf4j
public class SpringBootFeignClientExampleApplication implements CommandLineRunner {
	@Autowired
	PersonClient client;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFeignClientExampleApplication.class, args);
	}

	@Override
	public void run(String... args) {
		log.info(client.getPerson("affe").toString());
		log.info(client.getPerson("gorilla").toString());
	}
}
