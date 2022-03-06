package com.example.managementprocessorservice;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@AllArgsConstructor
@EnableFeignClients
@SpringBootApplication
public class ManagementProcessorServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagementProcessorServiceApplication.class, args);
    }

}
