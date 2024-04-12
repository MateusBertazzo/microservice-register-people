package com.mateudev.microserviceregister.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OfferResponseDto {

    private Long id;
    private String name;

    private String lastName;

    private String cpf;

    private String telephone;

    private Double income;

    private int paymentTerm;

    private Double requestedAmount;

    private Boolean approved;

    private String observation;
}
