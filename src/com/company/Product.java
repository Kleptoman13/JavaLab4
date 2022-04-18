package com.company;

public class Product{

    private int count;

    public void setCount(int count) {
        this.count = count > 0 ? count : 1;
    }

    public int getCount() {
        return count;
    }

    private int price;

    public void setPrice(int price) {
        this.price = price > 0 ? price : 1;
    }

    public int getPrice() {
        return price;
    }

    private int year;

    public void setYear(int year) {
        this.year = year <= 2022 ? year : 2022;
    }

    public int getYear() {
        return year;
    }

    private String production;

    public void setProduction(String production) {
        this.production = production;
    }

    public String getProduction() {
        return production;
    }

    public void vivod()
    {
        System.out.println("Count: " + this.count + " шт., Price: " + this.price + " грн, Year: " + this.year + ", Production: " + this.production);
    }

}