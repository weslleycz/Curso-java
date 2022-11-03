package com.aula66.app;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

/**
 * Aula 66
 *
 */
public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product date:");

        System.out.print("Name:");
        product.name= sc.next();

        System.out.print("Price:");
        product.price = sc.nextDouble();

        System.out.print("Quantity is stock:");
        product.quantity = sc.nextInt();

        System.out.println(product.name +" , "+product.price + " , " +product.quantity);

        sc.close();
    }
}
