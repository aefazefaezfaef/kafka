package com.anassm.app.infrastructure;


import com.anassm.app.application.Business;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = {"com.anassm.app.application"},
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Business.class)
)
public class DomainConfig {
}
