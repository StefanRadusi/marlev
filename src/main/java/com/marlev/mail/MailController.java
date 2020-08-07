package com.marlev.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MailController {

    @Autowired
    EmailServiceImpl emailService;

    @PostMapping("/mail")
    public ResponseEntity<Object> newMail(@RequestBody Mail newMail) {
        emailService.sendSimpleMessage(newMail);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/mail")
    public String gotMessage(){
        return "Works";
    }
}
