package com.example.tidexist.tidoper.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.example.tidexist.tidoper.repository")
@EnableCaching
public class JpaConfig {

}