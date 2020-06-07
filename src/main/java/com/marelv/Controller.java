package com.marelv;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Controller {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}