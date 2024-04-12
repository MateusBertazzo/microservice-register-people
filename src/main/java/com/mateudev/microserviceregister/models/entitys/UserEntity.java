package com.mateudev.microserviceregister.models.entitys;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "last_name")
    private String lastName;

    private String cpf;

    private String telephone;

    private Double income;

    @OneToOne(mappedBy = "userEntity")
    private OfferEntity offerEntity;
}
