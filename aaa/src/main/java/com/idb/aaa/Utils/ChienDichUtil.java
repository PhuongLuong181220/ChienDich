package com.idb.aaa.Utils;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.idb.aaa.Entities.ChienDich;
import com.idb.aaa.Services.ChienDichService;

@Component
public class ChienDichUtil {

    @Autowired
    private BulkMailSenderUtil bulkMailSenderUtil;

    @Autowired
    private ChienDichService chienDichService;

    public void SendBulkMailOfAllCd() {

        LocalDate today = LocalDate.now();

        List<ChienDich> chienDichs = chienDichService.retrieveAll();

        for (ChienDich chienDich : chienDichs) {
            if((today.isAfter(chienDich.getNgayBatDau()) || today.isEqual(chienDich.getNgayBatDau())) && (today.isBefore(chienDich.getNgayKetThuc()) || today.isEqual(chienDich.getNgayKetThuc()))) {
                if(chienDich.getLoaiCd().equals("Tháng")) {
                    if(chienDich.getDayOfMonth().equals("" + today.getDayOfMonth())) {
                        bulkMailSenderUtil.SendMailToAllKhOfCd(chienDich.getId());
                    }
                } else if(chienDich.getLoaiCd().equals("Tuần")) {
                    if(chienDich.getDayOfWeek().equals("" + today.getDayOfWeek())) {
                        bulkMailSenderUtil.SendMailToAllKhOfCd(chienDich.getId());
                    }
                } else if(chienDich.getLoaiCd().equals("Ngày")) {
                    bulkMailSenderUtil.SendMailToAllKhOfCd(chienDich.getId());
                }
            }
        }
    }
}
