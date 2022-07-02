package com.idb.aaa.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idb.aaa.Entities.ChienDich;
import com.idb.aaa.JpaRepo.ChienDichRepo;

@Service
public class ChienDichService {
    @Autowired
    private ChienDichRepo repo;

    public List<ChienDich> retrieveAll() {
        return repo.findAll();
    }

    public ChienDich retrieveOneById(String id) {
        ChienDich tmp = null;

        try {
            tmp = repo.findById(id).get();
        } catch (Exception e) {
            
        }

        return tmp;
    }
}
