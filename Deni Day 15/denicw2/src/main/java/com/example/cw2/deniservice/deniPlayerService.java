package com.example.cw2.deniservice;

import com.example.cw2.denimodel.deniPlayer;
import com.example.cw2.denirepository.deniPlayerRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class deniPlayerService {

    @Autowired
    private deniPlayerRepo playerRepo;

    public List<deniPlayer> getAllPlayers() {
        return playerRepo.findAll();
    }

    public deniPlayer getPlayerById(int id) {
        return playerRepo.findById(id).orElse(null);
    }

    public deniPlayer addPlayer(deniPlayer player) {
        return playerRepo.save(player);
    }
}
