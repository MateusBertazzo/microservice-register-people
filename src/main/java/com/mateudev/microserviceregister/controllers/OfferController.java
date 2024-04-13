package com.mateudev.microserviceregister.controllers;

import com.mateudev.microserviceregister.dto.OfferRequestDto;
import com.mateudev.microserviceregister.dto.OfferResponseDto;
import com.mateudev.microserviceregister.services.OfferService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/proposta")
public class OfferController {

    private final OfferService offerService;

    @PostMapping
    public ResponseEntity<OfferResponseDto> createOffer(@RequestBody OfferRequestDto reequestDto) {

        OfferResponseDto response = offerService.createOffer(reequestDto);

        return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(response.getId())
                .toUri())
                .body(response);
    }

    @GetMapping
    public ResponseEntity<List<OfferResponseDto>> getOffer() {

        return ResponseEntity.ok(offerService.getOffer());
    }
}
