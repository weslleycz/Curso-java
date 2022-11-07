package com.aula89.app;

import java.util.Locale;
import java.util.Scanner;

import com.aula89.app.entities.Product;

/**
 * Aula 89
 *
 */
public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero de produtos:");
        int n = sc.nextInt();

        Product[] vect = new Product[n];

        for (int index = 0; index < vect.length; index++) {
            System.out.println("Nome do produto:");
            String name = sc.next();
            System.out.println("Preço do produto:");
            double price = sc.nextDouble();
            vect[index] = new Product(name, price);
        }

        double sum = 0.0;

        for (int index = 0; index < vect.length; index++) {
            sum += vect[index].getPrice();
        }

        double avg = sum / n;

        System.out.println("Preco medio:" + avg);

        sc.close();
    }
}
