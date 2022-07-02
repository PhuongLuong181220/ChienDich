package com.idb.aaa.JpaRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idb.aaa.Entities.KhachHang;

public interface KhachHangRepo extends JpaRepository<KhachHang, String> {
    
}