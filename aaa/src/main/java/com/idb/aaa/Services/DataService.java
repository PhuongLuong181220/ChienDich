package com.idb.aaa.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idb.aaa.Entities.Data;
import com.idb.aaa.JpaRepo.DataRepo;

@Service
public class DataService {
    @Autowired
    private DataRepo repo3;

    public List<Data> retrieveAll() {
        return repo3.findAll();
    }

    public Data retrieveOneById(String id) {
        Data tmp3 = null;

        try {
            tmp3 = repo3.findById(id).get();
        } catch (Exception e) {
            
        }

        return tmp3;
    }

    public List<Data> retrieveByChienDich(String chienDich) {
        return repo3.findByChienDichData(chienDich);
    }
}
