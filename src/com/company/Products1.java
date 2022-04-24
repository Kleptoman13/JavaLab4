package com.company;

import java.time.LocalDate;

public class Products1 {
    private Product1[] products;
    private int currentProductNumber;


    public Products1(final int productsNumber)
    {
        this.products = new Product1[productsNumber];
        currentProductNumber = -1;
    }

    public void addProduct (Product1 product)
    {
        if (++currentProductNumber < products.length)
        {
            products[currentProductNumber] = product;
        }
    }

    public int commonPrice()
    {
        int common = 0;
        Product1 product1 = products[0];

        for (Product1 product:products)
        {
            if (LocalDate.now().isAfter(product.getSroc()))
            {
                common += (product.getCount() * product.getPrice());

            }
        }
        return common;
    }

    public String toString()
    {
        String result = "Products: " + System.lineSeparator();

        for (Product1 product:products)
        {
            result += product + System.lineSeparator();
        }
        return result;
    }
}
