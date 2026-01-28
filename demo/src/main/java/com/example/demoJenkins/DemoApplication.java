package com.example.demoJenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello Jenkins CI 🚀");
		while (true) {
			Thread.sleep(1000);
			System.out.println("App is running...");
		}
    }

}
