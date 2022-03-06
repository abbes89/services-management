package com.example.managementproducerservice.consumers;

import com.example.managementproducerservice.dtos.ServiceDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.function.Consumer;

@Configuration
public class ServicesManagementConsumer {

    private static final Logger log = LoggerFactory.getLogger(ServicesManagementConsumer.class);

    @Bean
    public Consumer<List<ServiceDto>> consumer() {
        return (value) -> {
            value.stream().forEach(a -> {
                log.info("The tag is {}", a.getTag());
                log.info("The action is {}", a.getAction());
            });
        };
    }
}


