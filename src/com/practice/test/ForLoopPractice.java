package com.practice.test;

import java.util.List;

public class ForLoopPractice {

    public static void main(String[] args) {

        List<String> strings = List.of("men", "Women", "Animal", "Bird");

        strings.stream().
                filter(element -> element.contains("men")).
                forEach(System.out::println);

        //printWithFp(strings);
        //printBasic(strings);
    }

    private static void printBasic(List<String> strings) {
        for (String string : strings) {  //Object Mutation
            if(string.contains("men")) {
                System.out.println(string);
            }
        }
    }

    private static void printWithFp(List<String> strings) {
        strings.forEach(System.out::println);
    }

}
