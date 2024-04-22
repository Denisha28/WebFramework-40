package com.examly.springapp.Deniservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Denimodel.DeniDoor;
import com.examly.springapp.Denirepository.DeniDoorRepo;

@Service
public class DeniDoorService {
    @Autowired
    private DeniDoorRepo doorRepo;

    public DeniDoor postData(DeniDoor door) {
        return doorRepo.save(door);
    }

    public List<DeniDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public DeniDoor updateDetail(int doorid, DeniDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<DeniDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<DeniDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public DeniDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}