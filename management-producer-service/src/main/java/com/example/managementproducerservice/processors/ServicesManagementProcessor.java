package com.example.managementproducerservice.processors;

import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesManagementProcessor {

    private static final Logger log = LoggerFactory.getLogger(ServicesManagementProcessor.class);

    @Bean
    public Function<String, String> processor() {
        return (value) -> {
            log.info("Printing from Processor");
            return value +" : Value is processed";
        };
    }
}