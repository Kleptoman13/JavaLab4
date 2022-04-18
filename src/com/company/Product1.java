package com.company;


import java.time.LocalDate;

public class Product1 {

    private String name;
    private int price;
    private LocalDate data;
    private LocalDate sroc;
    private int count;
    private String production;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setSroc(LocalDate sroc) {
        this.sroc = sroc.isAfter(this.data) ? sroc : this.data;
    }
    public LocalDate getSroc() {
        return sroc;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }
}
