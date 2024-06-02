package com.felix.runners;

import com.felix.runners.run.Location;
import com.felix.runners.run.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class RunnersApplication {

	private static final Logger log = LoggerFactory.getLogger(RunnersApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RunnersApplication.class, args);
//		log.info("Something changed");
	}

	@Bean
	CommandLineRunner runner(){
		return args -> {
			Run run = new Run(
					1,
					"First Run",
					LocalDateTime.now(),
                    LocalDateTime.now().plusHours(1),
					5,
					Location.OUTDOOR);
			log.info("Run: "+ run);
		};
	}

}
