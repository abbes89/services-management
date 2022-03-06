package com.example.managementproducerservice.controllers;

import lombok.AllArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class ServicesManagementProducer {

    private StreamBridge streamBridge;

    @PostMapping("/msg")
    public ResponseEntity<String> sendService(@RequestBody String service){
        streamBridge.send("producer-out-0", service);

        return ResponseEntity.ok("Service sent");
    }

}