package com.company;

import java.util.Arrays;

public class Products {
    private Product[] products;
    private int currentProductNumber;


    public Products(final int productsNumber)
    {
        this.products = new Product[productsNumber];
        currentProductNumber = -1;
    }

    public int findNeedYear()
    {
        Product product1 = products[0];
        int k = 0;
        for (Product product: products)
        {
            if (2022 - product.getYear() >= 2)
            {
                k += product.getCount();
                System.out.println(product);
            }
        }
        return k++;
    }

    public void addProduct (Product product)
    {
        if (++currentProductNumber < products.length)
        {
            products[currentProductNumber] = product;
        }
    }

    public String toString()
    {
        String result = "Products: " + System.lineSeparator();

        for (Product product:products)
        {
            result += product + System.lineSeparator();
        }
        return result;
    }
}
