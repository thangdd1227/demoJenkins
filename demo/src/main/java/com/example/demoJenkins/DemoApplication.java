package com.example.demoJenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello Jenkins CI 🚀");
		System.out.println("Commit 1");
		while (true) {
			Thread.sleep(5000);
			System.out.println("App is running...");
		}
    }

}
