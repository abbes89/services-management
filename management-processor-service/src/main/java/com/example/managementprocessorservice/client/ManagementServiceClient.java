package com.example.managementprocessorservice.client;

import com.example.managementprocessorservice.dtos.ServiceDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "jplaceholder", url = "http://management-service-server:8080/")
public interface ManagementServiceClient {

    @GetMapping("/api/services")
    List<ServiceDto> getAllServices();


}
