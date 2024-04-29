package com.example.denicw1.denicontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.denicw1.denimodel.deniAddress;
import com.example.denicw1.deniservice.deniAddressService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class deniAddressController {
    
    @Autowired
    deniAddressService addressService;

    @SuppressWarnings("null")
    @PostMapping("/address/employee/{id}")
    public ResponseEntity<deniAddress> postMethodName(@RequestBody deniAddress address,@PathVariable int id) {
        
        try{
            return new ResponseEntity<>(addressService.setAddressById(id, address),HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
