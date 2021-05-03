package com.practice.test;

import java.util.List;
import java.util.Optional;

public class mapAndReducePractice {

    public static void main(String[] args) {
        //Probleam : square of 2,3,4,5,6
        //probleam: addition of all

        List<Integer> numbers= List.of(2,3,4,5,6);

        Integer value=numbers.stream().reduce(0,(integer, integer2) -> integer+integer2);
        System.out.println(value);
    }

}
