package com.bnta.chocolate.services;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ChocolateService {


    @Autowired
    ChocolateRepository chocolateRepository;

    @Autowired
    EstateService estateService;

    private ArrayList<Chocolate> chocolateList;

    public ChocolateService(){

    }

    public ChocolateRepository getChocolateRepository() {
        return chocolateRepository;
    }

    public void setChocolateRepository(ChocolateRepository chocolateRepository) {
        this.chocolateRepository = chocolateRepository;
    }

    public EstateService getEstateService() {
        return estateService;
    }

    public void setEstateService(EstateService estateService) {
        this.estateService = estateService;
    }

    public ArrayList<Chocolate> getChocolateList() {
        return chocolateList;
    }

    public void setChocolateList(ArrayList<Chocolate> chocolateList) {
        this.chocolateList = chocolateList;
    }
}
