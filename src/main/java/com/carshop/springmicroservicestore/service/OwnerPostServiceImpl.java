package com.carshop.springmicroservicestore.service;

import com.carshop.springmicroservicestore.client.CarPostStoreClient;
import com.carshop.springmicroservicestore.dto.OwnerPostDTO;
import org.springframework.stereotype.Service;

@Service
public class OwnerPostServiceImpl implements OwnerPostService {

    private CarPostStoreClient carPostStoreClient;

    public OwnerPostServiceImpl(CarPostStoreClient carPostStoreClient) {
        this.carPostStoreClient = carPostStoreClient;
    }

    @Override
    public void createOwnerCar(OwnerPostDTO ownerPostDTO) {
        carPostStoreClient.ownerPostsClient(ownerPostDTO);
    }
}
