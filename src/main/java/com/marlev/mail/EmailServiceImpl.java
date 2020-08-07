package com.marlev.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl {

    private final JavaMailSender emailSender;

    @Autowired
    public EmailServiceImpl(JavaMailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendSimpleMessage(Mail newMail) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(newMail.getEmail());
        message.setTo("marlev.invest.1@gmail.com");
        message.setSubject("Concact de la: " + newMail.getName() + " telefon: " + newMail.getPhone());
        message.setText(newMail.getMessage());

        emailSender.send(message);
    }

}
