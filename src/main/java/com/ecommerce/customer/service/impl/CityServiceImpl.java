package com.ecommerce.customer.service.impl;

import com.ecommerce.customer.model.City;
import com.ecommerce.customer.repository.CityRepository;
import com.ecommerce.customer.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }
}
