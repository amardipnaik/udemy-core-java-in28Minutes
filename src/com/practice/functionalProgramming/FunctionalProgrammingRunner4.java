package com.practice.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FunctionalProgrammingRunner4 {

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(3,4,5,6,7,2,1);

        //printMin(numbers);

        printEvenList(numbers);
    }

    private static void printEvenList(List<Integer> numbers) {
        numbers.stream().filter(num->num%2==0).collect(Collectors.toList()).
                    forEach(System.out::println);
    }

    private static void printMax(List<Integer> numbers) {
        Optional number=numbers.stream().max(Integer::compare);
        System.out.println("Number Is :: "+number.get());
    }

    private static void printMin(List<Integer> numbers) {
        Optional number=numbers.stream().min(Integer::compare);
        System.out.println("Number Is :: "+number.get());
    }


}
