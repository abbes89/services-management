package com.example.managementconsumerservice;

import com.example.managementconsumerservice.resources.ManagementServiceResource;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@AllArgsConstructor
@EnableFeignClients
@SpringBootApplication
public class ManagementConsumerServiceApplication {

    private ManagementServiceResource managementServiceResource;

    public static void main(String[] args) {
        SpringApplication.run(ManagementConsumerServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> { managementServiceResource.getAll(); };
    }
}
