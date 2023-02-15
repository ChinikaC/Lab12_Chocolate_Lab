package com.bnta.chocolate.services;


import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstateService {

    @Autowired
    EstateRepository estateRepository;

    private ArrayList<Estate> estateList;

    public EstateService(){
    }

    public List<Estate> getAllEstates(){
        return estateRepository.findAll();
    }

    public Estate saveEstates(Estate estate){
        estateRepository.save(estate);
        return estate;
    }


}
