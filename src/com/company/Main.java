package com.company;
import java.time.LocalDate;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        //task1();
        task2();
    }

    /**
     *
     * Количество
     * Цена
     * Год изготовления
     * Производитель
     *
     * Определить количество товаров, произведённых
     * более чем два года назад, и напечатать все сведения
     * о них.
     * */

    public static void task1()
    {
        Scanner in = new Scanner(System.in);
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product[] products = new Product[]{product1, product2, product3};

        product1.setCount(8);
        product1.setPrice(260);
        product1.setYear(2019);
        product1.setProduction("IKEA");

        product2.setCount(5);
        product2.setPrice(1080);
        product2.setYear(2021);
        product2.setProduction("IKEA");

        product3.setCount(5);
        product3.setPrice(560);
        product3.setYear(2014);
        product3.setProduction("IKEA");

        int common = 0;
        for (int i = 0; i < products.length; i++) {
            if (2022 - products[i].getYear() >= 2)
            {
                common += products[i].getCount();
                products[i].vivod();
            }
        }

        System.out.println("Количество товаров, произведённых более чем два года назад: " + common + " шт.");
    }

    /**
     *
     * Наименование
     * Цена
     * Дата производства
     * Срок годности
     * Количество
     * Производитель
     *
     * Определить общую стоимость просроченных товаров.
     * */

    public static void task2()
    {
        Scanner in = new Scanner(System.in);
        Product1 product1 = new Product1();
        Product1 product2 = new Product1();
        Product1 product3 = new Product1();

        Product1[] products = new Product1[]{product1, product2, product3};

        product1.setName("Хлеб");
        product1.setPrice(20);
        product1.setData(LocalDate.of(2022, 1, 23));
        product1.setSroc(LocalDate.of(2022, 2, 23));
        product1.setCount(8);
        product1.setProduction("Булочная");

        product2.setName("Молоко");
        product2.setPrice(30);
        product2.setData(LocalDate.of(2022, 4, 13));
        product2.setSroc(LocalDate.of(2022, 4, 15));
        product2.setCount(15);
        product2.setProduction("Корова");

        product3.setName("Яйца");
        product3.setPrice(2);
        product3.setData(LocalDate.of(2022, 4, 8));
        product3.setSroc(LocalDate.of(2022, 4, 23));
        product3.setCount(40);
        product3.setProduction("Курица");
        int sum = 0;
        for (int i = 0; i < products.length; i++) {
            if (LocalDate.now().isAfter(products[i].getSroc()))
            {
                sum += (products[i].getPrice() * products[i].getCount());
            }
        }

        System.out.println("Общая стоимость простроченных товаров: " + sum + " грн");
    }

}
