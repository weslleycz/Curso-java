package org.aula98;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Anna");
        list.add("Anna");
        list.add(2, "Marcos");

        System.out.println(list.size());

        list.remove("Maria");

        for (String item : list) {
            System.out.println(item);
        }

        // lambida

        System.out.println("----------------------------------------------");
        list.remove(1);
        list.removeIf(x -> x == "Bob");

        for (String item : list) {
            System.out.println(item);
        }
        System.out.println("----------------------------------------------");
        System.out.println("Index of Anna " + list.indexOf("Anna"));
        System.out.println("Index of Anna " + list.indexOf("Bob"));

        for (String item : list) {
            System.out.println(item);
        }
        System.out.println("----------------------------------------------");

        List<String> result = (List<String>) list.stream().filter(x -> x == "Anna").collect(Collectors.toList());

        for (String item : result) {
            System.out.println(item);
        }
    }
}