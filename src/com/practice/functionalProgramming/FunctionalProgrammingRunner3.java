package com.practice.functionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner3 {

    public static void main(String[] args) {
        List<Integer> numbers=List.of(3,4,5,6,7);
        List<String> animals=List.of("Lion","Tiger","Rat");

        //printLowerCase(animals);

        printLength(animals);

        //printSquare(numbers);
    }

    private static void printLength(List<String> animals) {
        animals.stream().map(animal->animal.length()).
                forEach(System.out::println);
    }

    private static void printLowerCase(List<String> animals) {
        animals.stream().map(animal->animal.toLowerCase()).
                forEach(System.out::println);
    }

    private static void printSquare(List<Integer> numbers) {
        numbers.stream().map(element->element*element).
                forEach(System.out::println);
    }

}
