package com.example.managementprocessorservice.processors;

import com.example.managementprocessorservice.dtos.ServiceDto;
import com.example.managementprocessorservice.resources.ManagementServiceResource;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.function.Function;

@AllArgsConstructor
@Configuration
public class ServicesManagementProcessor {

    private static final Logger log = LoggerFactory.getLogger(ServicesManagementProcessor.class);

    private ManagementServiceResource managementServiceResource;

    @Bean
    public Function<String, List<ServiceDto>> processor() {
        return (value) -> {
            log.info("Printing from Processor");
            return managementServiceResource.getAll();
        };
    }
}