package com.example.managementprocessorservice.resources;

import com.example.managementprocessorservice.client.ManagementServiceClient;
import com.example.managementprocessorservice.dtos.ServiceDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ManagementServiceResource {

    private ManagementServiceClient managementServiceClient;

    public List<ServiceDto> getAll() {
        List<ServiceDto> result = managementServiceClient.getAllServices();
        result.stream().forEach(a -> System.out.println("tag: "+ a.getTag()));
        return result;
    }
}
