package com.mateudev.microserviceregister.services;

import com.mateudev.microserviceregister.dto.OfferRequestDto;
import com.mateudev.microserviceregister.dto.OfferResponseDto;
import com.mateudev.microserviceregister.mapper.OfferMapper;
import com.mateudev.microserviceregister.models.entitys.OfferEntity;
import com.mateudev.microserviceregister.models.repositorys.OfferRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class OfferService {

    private final OfferRepository offerRepository;

    public OfferResponseDto createOffer(OfferRequestDto offerRequestDto) {

        OfferEntity offerEntity = OfferMapper.INSTANCE.convertDtoToOfferEntity(offerRequestDto);

        offerRepository.save(offerEntity);

        return OfferMapper.INSTANCE.convertOfferEntityToDto(offerEntity);
    }

    public List<OfferResponseDto> getOffer() {
        Iterable<OfferEntity> allOffers = offerRepository.findAll();

        return OfferMapper.INSTANCE.convertListOfferToListDto(allOffers);
    }
}
