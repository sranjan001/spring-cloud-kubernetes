package com.satya.travelagency.repository;

import java.util.List;

import com.satya.travelagency.model.TravelDeal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TravelDealRepository extends MongoRepository<TravelDeal, String> {

    public List<TravelDeal> findByDestination(String destination);

}