package com.betterjavacode.SpringAppCache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.betterjavacode")
@EnableJpaRepositories(basePackages = "com.betterjavacode.repositories")
//@EnableCaching
public class SpringAppCacheApplication
{
	public static void main(String[] args) {
		SpringApplication.run(SpringAppCacheApplication.class, args);
	}
}
