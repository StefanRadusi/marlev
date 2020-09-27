package com.marlev.mail;

public class Mail {
    private String name;
    private String email;
    private String phone;
    private String city;
    private String message;

    public Mail() {
    }

    public Mail(String name, String email, String phone, String city, String message) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.city = city;
        this.message = message;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
