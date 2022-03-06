package com.example.managementService.dtos;

import com.example.managementService.enums.ActionType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@NoArgsConstructor
@Getter
@Setter
public class ServiceDto {

    private UUID courseId;
    private String tag;
    private ActionType action;

}
