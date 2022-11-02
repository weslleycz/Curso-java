package com.aula23.app;

import java.util.Locale;

public class App {
    public static void main(String[] args) {
        int number = 1;
        double real = 10.35784;
        System.out.println("Hello World!");
        System.out.println(number);
        System.out.println(real);

        // Define a região como estados unidos
        Locale.setDefault(Locale.US);

        System.out.printf("%.2f\n", real);

    }
}
