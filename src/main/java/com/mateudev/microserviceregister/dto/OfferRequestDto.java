package com.mateudev.microserviceregister.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OfferRequestDto {

    private String name;

    private String lastName;

    private String cpf;

    private String telephone;

    private Double income;

    private int paymentTerm;

    private Double requestedAmount;
}
