package com.mateudev.microserviceregister.mapper;

import com.mateudev.microserviceregister.dto.OfferRequestDto;
import com.mateudev.microserviceregister.models.entitys.OfferEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface OfferMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "approved", ignore = true)
    @Mapping(target = "integrated", ignore = true)
    @Mapping(target = "observation", ignore = true)
    @Mapping(target = "userEntity.name", source = "name")
    @Mapping(target = "userEntity.lastName", source = "lastName")
    @Mapping(target = "userEntity.cpf", source = "cpf")
    @Mapping(target = "userEntity.telephone", source = "telephone")
    @Mapping(target = "userEntity.income", source = "income")
    OfferEntity convertDtoToOfferEntity(OfferRequestDto offerRequestDto);
}
