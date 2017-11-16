package net.divineit.uzzal.SpringBoot_JPA_Hibernet_basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootJpaHibernetBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaHibernetBasicApplication.class, args);
	}
}
