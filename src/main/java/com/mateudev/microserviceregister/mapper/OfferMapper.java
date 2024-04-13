package com.mateudev.microserviceregister.mapper;

import com.mateudev.microserviceregister.dto.OfferRequestDto;
import com.mateudev.microserviceregister.dto.OfferResponseDto;
import com.mateudev.microserviceregister.models.entitys.OfferEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.text.NumberFormat;
import java.util.List;

@Mapper
public interface OfferMapper {

    OfferMapper INSTANCE = Mappers.getMapper(OfferMapper.class);

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

    @Mapping(target = "name", source = "userEntity.name")
    @Mapping(target = "lastName", source = "userEntity.lastName")
    @Mapping(target = "cpf", source = "userEntity.cpf")
    @Mapping(target = "telephone", source = "userEntity.telephone")
    @Mapping(target = "income", source = "userEntity.income")
    @Mapping(target = "requestedAmountFormatted", expression = "java(formatRequestedAmount(offerEntity))")
    OfferResponseDto convertOfferEntityToDto(OfferEntity offerEntity);


    List<OfferResponseDto> convertListOfferToListDto(Iterable<OfferEntity> offerEntities);

    default String formatRequestedAmount(OfferEntity offerEntity) {
        return NumberFormat.getCurrencyInstance().format(offerEntity.getRequestedAmount());
    }
}
