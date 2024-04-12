package com.mateudev.microserviceregister.services;

import com.mateudev.microserviceregister.dto.OfferRequestDto;
import com.mateudev.microserviceregister.dto.OfferResponseDto;
import com.mateudev.microserviceregister.models.repositorys.OfferRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class OfferService {

    private final OfferRepository offerRepository;

    public OfferResponseDto createOffer(OfferRequestDto offerRequestDto) {

        return null;
    }
}
