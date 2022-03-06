package com.example.managementconsumerservice.consumers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.function.Consumer;

@Configuration
public class ServicesManagementConsumer {

    private static final Logger log = LoggerFactory.getLogger(ServicesManagementConsumer.class);

    @Bean
    public Consumer<String> consumer() {
        return (value) -> {
            log.info("Received the value in Consumer {}",value);
        };
    }
}


