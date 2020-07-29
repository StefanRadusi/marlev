package com.marlev.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class GardOrderController {

    @Autowired
    GardOrderRepository repository;


    @PostMapping("/comanda")
    public String addOrder(@RequestBody GardOrder order) {

        repository.save(order);

        return "alalalla";
    }
}
