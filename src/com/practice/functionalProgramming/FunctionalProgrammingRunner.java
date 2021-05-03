package com.practice.functionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class FunctionalProgrammingRunner {

    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Mango", "Banana", "Tango");

        printWithFunctionalProgrammingFilter(list);
    }

    private static void printBasic(List<String> list) {
        for (String string : list) {
            System.out.println(string);
        }
    }

    private static void printBasicWithFilter(List<String> list) {
        for (String string : list) {
            if (string.contains("go")) {
                System.out.println(string);
            }
        }
    }

    private static void printWithFunctionalProgramming(List<String> list) {
        list.stream().forEach(element -> System.out.println(element));
    }

    private static void printWithFunctionalProgrammingFilter(List<String> list) {
        list.stream()
                .filter(data -> data.contains("go"))
                .forEach(element -> System.out.println(element));
    }


}
