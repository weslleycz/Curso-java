package com.aula88.app;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Aula 88
 *
 */
public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#.##");

        System.out.println("Digite o tamanho do vetor");
        int n = sc.nextInt();

        double[] vector = new double[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Digite o "+(i+1)+"º numero");
            vector[i] = sc.nextDouble();
        }

        double sum = 0;

        for (double item : vector) {
            sum = (item + sum);
        }

        double avg = sum/n;

        avg = Double.valueOf(formato.format(avg));

        System.out.println("Average height "+avg);
        sc.close();
    }
}
