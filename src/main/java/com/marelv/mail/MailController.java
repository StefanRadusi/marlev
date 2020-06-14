package com.marelv.mail;

import org.springframework.web.bind.annotation.*;

@RestController
public class MailController {

    @PostMapping("/mail")
    public String newMail(@RequestBody Mail newMail) {
        System.out.println("Got mail data");
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/mail")
    public String gotMessage(){
        return "Works";
    }
}
