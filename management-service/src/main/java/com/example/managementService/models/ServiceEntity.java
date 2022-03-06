package com.example.managementService.models;

import com.example.managementService.enums.ActionType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "SERVICE")
public class ServiceEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;

    @Column(length = 5)
    @Size(max=5)
    private String tag;

    @Enumerated(EnumType.STRING)
    private ActionType action;

}
