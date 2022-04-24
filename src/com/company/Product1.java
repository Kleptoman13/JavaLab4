package com.company;


import java.time.LocalDate;

public class Product1 {

    private String name;
    private int price;
    private LocalDate data;
    private LocalDate sroc;
    private int count;
    private String production;

    public Product1(String name, int price, LocalDate data, LocalDate sroc, int count, String production) {
        this.setName(name);
        this.setPrice(price);
        this.setData(data);
        this.setSroc(sroc);
        this.setCount(count);
        this.setProduction(production);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price > 0 ? price : 1;
    }

    public int getPrice() {
        return price;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setSroc(LocalDate sroc) {
        this.sroc = sroc.isAfter(this.data) ? sroc : this.data;
    }

    public LocalDate getSroc() {
        return sroc;
    }

    public void setCount(int count) {
        this.count = count > 0 ? count : 1;
    }

    public int getCount() {
        return count;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getProduction() {
        return production;
    }
    public String toString()
    {
        return "Product{" +
                "name: " + getName() +
                ", price: " + getPrice() +
                ", data: " + getData() +
                ", sroc: " + getSroc() +
                ", count: " + getCount() +
                ", production: " + getProduction() + "}";
    }
}
