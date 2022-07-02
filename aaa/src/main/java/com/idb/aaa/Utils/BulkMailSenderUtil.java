package com.idb.aaa.Utils;

import java.util.ArrayList;
import java.util.List;

import javax.mail.internet.MimeMessage;

import org.apache.logging.log4j.message.MapMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.idb.aaa.Entities.Data;
import com.idb.aaa.Entities.KhachHang;
import com.idb.aaa.Services.DataService;
import com.idb.aaa.Services.KhachHangService;

@Component
public class BulkMailSenderUtil {
    @Autowired
    private DataService dataService;

    @Autowired
    private KhachHangService khachHangService;

    public List<String> retrieveListMailsKH(String idChienDich) {
        List<String> khachHangMails = new ArrayList<String>();

        List<Data> cdKh = dataService.retrieveByChienDich(idChienDich);

        for (Data item : cdKh) {
            KhachHang tmp = khachHangService.retrieveOneById(item.getKhachHangData());
            
            if(tmp != null) {
                if(tmp.getGmailKH() != null) {
                    String mailAddress = tmp.getGmailKH();

                    khachHangMails.add(mailAddress);
                }
            }
            
        }

        return khachHangMails;
    }

    public MimeMessage createMimeMessage() {
        return null;
    }
}
