package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.services.ChocolateService;
import com.bnta.chocolate.services.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/estates")
public class EstateController {

    @Autowired
    EstateService estateService;

    @GetMapping
    public ResponseEntity<List<Estate>> getAllEstates(){
        List<Estate> estate = estateService.getAllEstates();
        return new ResponseEntity<>(estate, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Estate> addNewEstate(@RequestBody Estate estate){
        Estate savedEstate = estateService.saveEstates(estate);
        return new ResponseEntity<>(savedEstate, HttpStatus.CREATED);
    }



}
