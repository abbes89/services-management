package com.example.managementprocessorservice.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ServiceDto {

    private UUID id;

    private String tag;

    private String action;
}
