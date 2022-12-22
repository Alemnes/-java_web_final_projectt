package com.example.java_web_final_projectt;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Laptop {

    @Id
    @GeneratedValue
    private Integer id;
    private String brand;
    private String color;

    public Laptop(){

    }

    public Laptop(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Laptop(Integer id, String brand, String color) {
        this.id = id;
        this.brand = brand;
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
