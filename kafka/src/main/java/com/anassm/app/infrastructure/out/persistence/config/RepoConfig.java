package com.anassm.app.infrastructure.out.persistence.config;

import com.anassm.app.infrastructure.out.persistence.OrderRepo;
import com.anassm.app.infrastructure.out.persistence.ProductRepo;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = {OrderRepo.class, ProductRepo.class})
public class RepoConfig {
}
