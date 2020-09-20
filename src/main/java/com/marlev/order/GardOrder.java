package com.marlev.order;

import java.util.List;

public class GardOrder {

    private String name;
    private String email;
    private String phone;
    private List<Offer> oferta;

    public GardOrder() {
    }

    public GardOrder(String name, String email, String phone, List<Offer> oferta) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.oferta = oferta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Offer> getOferta() {
        return oferta;
    }

    public void setOferta(List<Offer> oferta) {
        this.oferta = oferta;
    }
}
