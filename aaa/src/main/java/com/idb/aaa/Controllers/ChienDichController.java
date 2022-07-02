package com.idb.aaa.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idb.aaa.Entities.Data;
import com.idb.aaa.Entities.KhachHang;
import com.idb.aaa.Services.ChienDichService;
import com.idb.aaa.Services.DataService;
import com.idb.aaa.Services.KhachHangService;
import com.idb.aaa.Utils.BulkMailSenderUtil;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/ChienDich")
public class ChienDichController {
    @Autowired
    private ChienDichService chienDichService;
    
    @Autowired
    private DataService dataService;

    @Autowired
    private KhachHangService khachHangService;

    @Autowired
    private BulkMailSenderUtil bulkMailSenderUtil;

    @GetMapping (
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Object> retrieveAll() {
        ResponseEntity<Object> entity;

        entity = new ResponseEntity<>(chienDichService.retrieveAll(), HttpStatus.OK);

        return entity;
    }

    @GetMapping(
        value = "/api/v1/ChienDich/{idChienDich}/khachhangs"
    )
    public ResponseEntity<Object> retrieveAllKhCd(@PathVariable("idChienDich") String idChienDich) {
        ResponseEntity<Object> entity;

        // List<KhachHang> khachHangs = new ArrayList<KhachHang>();

        // List<Data> cdKh = dataService.retrieveByChienDich(idChienDich);

        // for (Data item : cdKh) {
        //     KhachHang tmp = khachHangService.retrieveOneById(item.getKhachHangData());

        //     khachHangs.add(tmp);
        // }

        // entity = new ResponseEntity<>(khachHangs, HttpStatus.OK);
        // BulkMailSenderUtil bulkMailSenderUtil = new BulkMailSenderUtil();
        List<String> mails = bulkMailSenderUtil.retrieveListMailsKH(idChienDich);

        Boolean kk = bulkMailSenderUtil.SendMailToAllKhOfCd(idChienDich);

        if(kk) {
            entity = new ResponseEntity<>(mails, HttpStatus.OK);
        } else {
            entity = new ResponseEntity<>("{ \"Send failed!\": \"@@\" }", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return entity;
    }
}
