package com.example.managementService.mappers;

import com.example.managementService.dtos.ServiceDto;
import com.example.managementService.models.ServiceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface ServiceMapper {

    @Mappings({
            @Mapping(target = "tag", source = "tag"),
            @Mapping(target = "action", source = "action")
    })
    public ServiceDto serviceToServiceDto(ServiceEntity serviceEntity);

}
