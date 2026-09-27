package javacore.toString.test;

import javacore.toString.domain.Product;

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product();

        product.setName("Iphone 16");
        product.setPrice(4550.0);
        product.setQuantity(2);
        System.out.println(product);
    }
}
