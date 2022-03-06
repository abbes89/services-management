package com.example.managementService.controllers;

import com.example.managementService.dtos.ServiceDto;
import com.example.managementService.mappers.ServiceMapper;
import com.example.managementService.resources.ServiceResource;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class ServiceController {

    private ServiceResource serviceResource;
    private ServiceMapper serviceMapper;

    @GetMapping("/services")
    public List<ServiceDto> findAll() {
        return serviceResource.findAll().stream().map(item -> serviceMapper.serviceToServiceDto(item)).collect(Collectors.toList());
    }
}
