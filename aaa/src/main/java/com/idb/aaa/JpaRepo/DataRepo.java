package com.idb.aaa.JpaRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idb.aaa.Entities.Data;

public interface DataRepo  extends JpaRepository< Data, String> {
    List<Data> findByChienDichData(String chienDichData);
}
