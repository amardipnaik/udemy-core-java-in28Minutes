package com.practice.functionalProgramming;

import java.util.Arrays;
import java.util.List;

public class FunctionalProgrammingRunner2 {

    public static void main(String[] args) {
        List<Integer> intLists = Arrays.asList(3, 4, 5, 5, 6, 7);

        //printBasic(intLists);

        //printSumWithFunctionalProgramming(intLists);

        printWithFunctionalProgrammingOdd(intLists);

    }

    private static void printWithFunctionalProgrammingOdd(List<Integer> intLists) {
        int sum = intLists.stream().filter(element -> element % 2 != 0).
                reduce(0, (integer, integer2) -> {
                    System.out.println("Number is: " +integer +integer2);
                    return integer + integer2;
                });
        System.out.println("Sum Is :: " + sum);
    }

    private static void printSumWithFunctionalProgramming(List<Integer> intLists) {
        int sum = intLists.stream().reduce(0, (integer, integer2) -> integer + integer2);
        System.out.println("Sum Is :: " + sum);
    }

    private static void printBasic(List<Integer> intLists) {
        int sum = 0;
        for (int number : intLists) {
            sum = sum + number;
        }
        System.out.println("Sum Is :: " + sum);
    }
}
