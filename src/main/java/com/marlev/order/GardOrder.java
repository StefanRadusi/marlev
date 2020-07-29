package com.marlev.order;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class GardOrder {

    @Id
    @GeneratedValue
    private int id;

    private String email;

    private Integer phone;

    private String comanda;

    @Size(min = 5, message = "Enter at least 10 Characters...")
    @Column(name = "details")
    private String details;

    public GardOrder() {
        super();
    }

    public GardOrder(int id, String email, Integer phone, String comanda,
        String details) {
        super();
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.comanda = comanda;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getComanda() {
        return comanda;
    }

    public void setComanda(String order) {
        this.comanda = order;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
