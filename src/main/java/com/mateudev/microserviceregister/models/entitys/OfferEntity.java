package com.mateudev.microserviceregister.models.entitys;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "offers")
public class OfferEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "requested_amount")
    private Double requestedAmount;

    @Column(name = "payment_term")
    private Integer paymentTerm;

    private Boolean approved;

    private boolean integrated;

    private String observation;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;
}
