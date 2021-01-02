package com.bratva.droidBot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.telegram.telegrambots.ApiContextInitializer;


@SpringBootApplication
@EnableScheduling
public class DroidBotApplication {
	public static void main(String[] args) {
		ApiContextInitializer.init();

		SpringApplication.run(DroidBotApplication.class, args);
	}

}
