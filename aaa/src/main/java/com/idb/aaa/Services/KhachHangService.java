package com.idb.aaa.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idb.aaa.Entities.KhachHang;
import com.idb.aaa.JpaRepo.KhachHangRepo;

@Service
public class KhachHangService {
    @Autowired
    private KhachHangRepo repo1;

    public List<KhachHang> retrieveAll() {
        return repo1.findAll();
    }

    public KhachHang retrieveOneById(String id) {
        KhachHang tmp1 = null;

        try {
            tmp1 = repo1.findById(id).get();
        } catch (Exception e) {
            
        }

        return tmp1;
    }
}
