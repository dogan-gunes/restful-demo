package com.dgn.restful_demo;

import com.dgn.restful_demo.model.User;
import com.dgn.restful_demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class RestfulDemoApplication implements CommandLineRunner {

	private final UserRepository userRepository;

	public RestfulDemoApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(RestfulDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User("doğan","güneş");
		User user2 = new User("volkan","özbek");
		userRepository.saveAll(Arrays.asList(user1,user2));
	}
}
