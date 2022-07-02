package com.idb.aaa.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.idb.aaa.Bussiness.SendAll;
//import com.idb.aaa.Entities.KhachHang;
//import com.idb.aaa.Entities.KhachHangList;
import com.idb.aaa.Services.KhachHangService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/KhachHang")
public class KhachHangController {
    @Autowired
    private KhachHangService khachHangService;

    @GetMapping (
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Object> retrieveAll() {
        ResponseEntity<Object> entity;

        entity = new ResponseEntity<>(khachHangService.retrieveAll(), HttpStatus.OK);

        return entity;
    }
}
    