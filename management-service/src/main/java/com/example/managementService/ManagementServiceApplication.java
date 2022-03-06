package com.example.managementService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.managementService.enums.ActionType;
import com.example.managementService.models.ServiceEntity;
import com.example.managementService.repositories.ServiceRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@AllArgsConstructor
@SpringBootApplication
public class ManagementServiceApplication {

    private static final Logger log = LoggerFactory.getLogger(ManagementServiceApplication.class);

    private ServiceRepository serviceRepository;

    public static void main(String[] args) {
        SpringApplication.run(ManagementServiceApplication.class, args);

        ServiceEntity serviceEntity = new ServiceEntity();
        serviceEntity.setTag("serv1");
        serviceEntity.setAction(ActionType.ACTIVE);

    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {

            log.info("Let's inspect the beans provided by Spring Boot:");

            ServiceEntity serviceEntity = new ServiceEntity();
            serviceEntity.setTag("serv1");
            serviceEntity.setAction(ActionType.ACTIVE);

            serviceRepository.save(serviceEntity);

        };
    }

}

