package com.example.managementService.resources;

import com.example.managementService.models.ServiceEntity;
import com.example.managementService.repositories.ServiceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ServiceResource {

    private ServiceRepository serviceRepository;

    public List<ServiceEntity> findAll() {
        return serviceRepository.findAll();
    }
}
