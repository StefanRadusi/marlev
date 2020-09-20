package com.marlev.order;

import com.marlev.mail.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class GardOrderController {


    @Autowired
    EmailServiceImpl emailService;


    @PostMapping("/oferta")
    public ResponseEntity<Object> addOrder(@RequestBody GardOrder order) {
        emailService.sendOrder(order);
        return ResponseEntity.ok().build();
    }
}
