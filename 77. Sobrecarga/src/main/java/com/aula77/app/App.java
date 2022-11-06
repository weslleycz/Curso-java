package com.aula77.app;

import java.io.Console;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

/**
 * Aula 77
 *
 */
public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.flush();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product date:");

        System.out.print("Name:");
        String name= sc.next();

        System.out.print("Price:");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

        System.out.println(product);

        System.out.println();
        System.out.print("Enter the number of products to be added is stock: ");

        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println(product);

        System.out.print("Enter the number of products to be remover is stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println(product);

        sc.close();
    }
}
