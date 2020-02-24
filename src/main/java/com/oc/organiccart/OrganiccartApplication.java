package com.oc.organiccart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableConfigurationProperties
@EntityScan(basePackages = { "com" })
@ComponentScan("com")
@EnableJpaRepositories("com")
@SpringBootApplication
public class OrganiccartApplication{

	public static void main(String[] args) {
		SpringApplication.run(OrganiccartApplication.class, args);
	}

}
