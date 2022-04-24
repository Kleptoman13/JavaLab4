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
        Product product1 = new Product(8, 260, 2019, "IKEA");
        Product product2 = new Product(5, 1080, 2021, "IKEA");
        Product product3 = new Product(5, 560, 2014, "IKEA");

        Products products = new Products(3);
        products.addProduct(product1);
        products.addProduct(product2);
        products.addProduct(product3);

        System.out.println(products.findNeedYear());

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
        Product1 product1 = new Product1("Hleb", 20, LocalDate.of(2022, 1, 30), LocalDate.of(2022, 2, 23), 8, "Bulochnaya");
        Product1 product2 = new Product1("Молоко", 30, LocalDate.of(2022, 4, 18), LocalDate.of(2022, 4, 15), 15, "Корова");
        Product1 product3 = new Product1("Яйца", 2, LocalDate.of(2022, 4, 8), LocalDate.of(2022, 4, 23), 40, "Курица");

        Products1 products = new Products1(3);
        products.addProduct(product1);
        products.addProduct(product2);
        products.addProduct(product3);

        System.out.println(products);

        System.out.println("общую стоимость просроченных товаров: " + products.commonPrice());
    }

}
