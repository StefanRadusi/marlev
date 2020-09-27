package com.marlev.mail;

import com.marlev.order.GardOrder;
import com.marlev.order.Offer;
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
        message.setSubject(
            "Concact de la: " + newMail.getName() + " telefon: " + newMail.getPhone() + " mail: " + newMail.getEmail()
                + " oras: " + newMail.getCity());
        message.setText(newMail.getMessage());

        emailSender.send(message);
    }

    public void sendOrder(GardOrder gard) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(gard.getEmail());
        message.setTo("marlev.invest.1@gmail.com");
        message.setSubject(
            "Cerere oferta de la: " + gard.getName() + " telefon: " + gard.getPhone() + " mail: " + gard.getEmail()
                + " oras: " + gard.getCity());
        message.setText(composeOrderMessage(gard));
        emailSender.send(message);
    }

    private String composeOrderMessage(GardOrder gard) {
        StringBuilder order = new StringBuilder();
        if (gard.getOferta() != null) {
            gard.getOferta().forEach(offer -> order.append("Produs: ")
                .append("\n\tNume gard: ").append(offer.getTitle())
                .append("\n\tlatime: ").append(offer.getWidth())
                .append("\n\tinaltime: ").append(offer.getHeight())
                .append("\n\tnumar lamele: ").append(offer.getNoOfLamella())
                .append("\n\tinaltime lamele: ").append(offer.getHeightOfLamella())
                .append("\n\tpret: ").append(offer.getPrice()).append(" lei \n\n"));

            order.append("Total: ").append(gard.getOferta().stream().map(Offer::getPrice)
                .reduce((double) 0, (subtotal, price) -> subtotal += price)).append(" lei");
        }
        return order.toString();
    }

}
