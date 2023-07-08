package com.carshop.springmicroservicestore.service;

import com.carshop.springmicroservicestore.dto.OwnerPostDTO;
import org.springframework.stereotype.Service;

@Service
public interface OwnerPostService {
    void createOwnerCar(OwnerPostDTO ownerPostDTO);
}
