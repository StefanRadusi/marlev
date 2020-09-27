package com.marlev.mail;

import com.marlev.order.GardOrder;
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

    public void sendOrder(GardOrder gard) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(gard.getEmail());
        message.setTo("marlev.invest.1@gmail.com");
        message.setSubject("Concact de la: " + gard.getName() + " telefon: " + gard.getPhone());
        message.setText(composeOrderMessage(gard));
        emailSender.send(message);
    }

    private String composeOrderMessage(GardOrder gard) {
        StringBuilder order = new StringBuilder();
        if (gard.getOferta() != null) {

            gard.getOferta().forEach(offer -> order.append("Comanda: ")
                .append("\n\tNume gard: ").append(offer.getTitle())
                .append("\n\tlatime: ").append(offer.getWidth())
                .append("\n\tinaltime: ").append(offer.getHeight())
                .append("\n\tnumar lamele: ").append(offer.getNoOfLamella())
                .append("\n\tinaltime lamele: ").append(offer.getHeightOfLamella())
                .append("\n\tpret: ").append(offer.getPrice()).append(" lei \n\n"));
        }
        return order.toString();
    }

}
