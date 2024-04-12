package com.mateudev.microserviceregister.controllers;

import com.mateudev.microserviceregister.dto.OfferRequestDto;
import com.mateudev.microserviceregister.dto.OfferResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/offers")
public class OfferController {
    @PostMapping
    public ResponseEntity<OfferResponseDto> createOffer(@RequestBody OfferRequestDto offerRequestDto) {
        return null;
    }
}
