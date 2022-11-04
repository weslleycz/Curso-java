package com.aula67.app;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

/**
 * Aula 67
 *
 */
public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.flush();

        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product date:");

        System.out.print("Name:");
        product.name= sc.next();

        System.out.print("Price:");
        product.price = sc.nextDouble();

        System.out.print("Quantity is stock:");
        product.quantity = sc.nextInt();

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
