package com.aula25.app;

import java.util.Scanner;

/**
 * Aula 25
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pega uma pagava digitada
        System.out.println("Quel e o seu nome?");
        String name = sc.next();
        System.out.println(name);

        //Pega um nume digitado
        int number = sc.nextInt();
        System.out.println(number);

        //Pega texto digitado
        String text = sc.nextLine();
        System.out.println(text);

        sc.close();
    }
}
