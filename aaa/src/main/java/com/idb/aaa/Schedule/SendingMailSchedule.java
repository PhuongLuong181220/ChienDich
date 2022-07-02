package com.idb.aaa.Schedule;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.idb.aaa.Utils.ChienDichUtil;

@Component
public class SendingMailSchedule {
    @Autowired
    private ChienDichUtil chienDichUtil;

    // private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss sss");
    
    @Scheduled(cron = "0 20 1 * * *")
    public void sendMails() {
        chienDichUtil.SendBulkMailOfAllCd();
    }
}