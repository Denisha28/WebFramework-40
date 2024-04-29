package com.example.denicw1.deniservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.denicw1.denimodel.deniAddress;
import com.example.denicw1.denirepository.deniAddressRepo;
import com.example.denicw1.denirepository.deniEmployeeRepo;

@Service
public class deniAddressService {
    @Autowired
    deniAddressRepo addressRepo;
    @Autowired
    deniEmployeeRepo employeeRepo;
    public deniAddress setAddressById(int id,deniAddress address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
