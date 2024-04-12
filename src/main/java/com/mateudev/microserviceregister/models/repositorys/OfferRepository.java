package com.mateudev.microserviceregister.models.repositorys;

import com.mateudev.microserviceregister.models.entitys.OfferEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends CrudRepository<OfferEntity, Long> {
}
