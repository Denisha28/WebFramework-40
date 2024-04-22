package com.example.springapp.Deniservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Denimodel.DeniDoor;
import com.example.springapp.Denirepository.DeniDoorRepo;

@Service
public class DeniDoorService {
    @Autowired
    private DoorRepo rep;

    public boolean post(DeniDoor door)
    {
        try
        {
            rep.save(door);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<DeniDoor> getAll()
    {
        return rep.findAll();
    }

    public List<DeniDoor> getbyDoorId(int doorId)
    {
        return rep.findByDoorId(doorId);
    }
    public List<DeniDoor> getbyType(String type)
    {
        return rep.findByAccessType(type);
    }
    
}
