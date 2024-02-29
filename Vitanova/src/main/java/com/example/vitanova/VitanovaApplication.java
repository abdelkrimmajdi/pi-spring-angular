package com.example.vitanova;

import com.example.vitanova.Entities.Role;
import com.example.vitanova.Entities.User;
import com.example.vitanova.Repositorie.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class VitanovaApplication /*implements CommandLineRunner*/ {
	@Autowired
	private UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(VitanovaApplication.class, args);
	}
	/*public void run(String... args){
		User adminAccount = userRepository.findByRole(Role.ADMIN);
		User user =new User();
		user.setEmail("admin@gmail.com");
		user.setFirstName("admin");
		user.setLastName("admin");
		user.setRole(Role.ADMIN);
		user.setPassword(new BCryptPasswordEncoder().encode("admin"));
		userRepository.save(user);
	}*/

}
