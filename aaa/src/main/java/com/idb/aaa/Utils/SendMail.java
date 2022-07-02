package com.idb.aaa.Utils;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mapping.MappingException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import lombok.Value;

public class SendMail {
    @Autowired
    private BulkMailSenderUtil bulkMailSenderUtil;

    public Boolean sendHtmlEmail(String htmlMsgContent, String[] receiver) throws MappingException {
        // Boolean success = false;

        MimeMessage message = bulkMailSenderUtil.createMimeMessage();

        Boolean multipart = true;

        MimeMessageHelper helper = new MimeMessageHelper(message, multipart, "utf-8");

        String htmlMsg = "<h3>Email from Joget - Campaign Management System</h3>";

        if(htmlMsgContent != null) {
            htmlMsg = htmlMsgContent;
        }
        message.setContent(htmlMsg, "text/html");

        // helper.setTo(receiver);
        helper.setTo(receiver);

        helper.setSubject("Joget - Marketing Email");

        bulkMailSenderUtil.send(message);

       return true;
}
}
