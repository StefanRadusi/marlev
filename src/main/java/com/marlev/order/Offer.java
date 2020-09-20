package com.marlev.order;

public class Offer {

    private String id;
    private String title;
    private Integer height;
    private Integer width;
    private Integer heightOfLamella;
    private Integer noOfLamella;
    private Double price;

    public Offer() {
    }

    public Offer(String id, String title, Integer height, Integer width, Integer heightOfLamella,
        Integer noOfLamella, Double price) {
        this.id = id;
        this.title = title;
        this.height = height;
        this.width = width;
        this.heightOfLamella = heightOfLamella;
        this.noOfLamella = noOfLamella;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeightOfLamella() {
        return heightOfLamella;
    }

    public void setHeightOfLamella(Integer heightOfLamella) {
        this.heightOfLamella = heightOfLamella;
    }

    public Integer getNoOfLamella() {
        return noOfLamella;
    }

    public void setNoOfLamella(Integer noOfLamella) {
        this.noOfLamella = noOfLamella;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
