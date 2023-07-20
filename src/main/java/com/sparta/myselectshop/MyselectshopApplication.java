package com.sparta.myselectshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableJpaAuditing
@SpringBootApplication //(exclude = SecurityAutoConfiguration.class)
public class MyselectshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyselectshopApplication.class, args);
    }

}
