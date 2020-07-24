package com.hyperaccesss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableScheduling
@SpringBootApplication
public class NsiaPasserelleReaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(NsiaPasserelleReaderApplication.class, args);
	}

	// Cette fonction permet d'encoder les mots de passe en BCrypt
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
