package com.practice.test;

import java.util.Arrays;
import java.util.List;

public class MapAndReducePractice {

    public static void main(String[] args) {
        //Probleam : square of 2,3,4,5,6
        //probleam: addition of all

        List<Integer> numbers= Arrays.asList(2,3,4,5,6);

        Integer value=numbers.stream().reduce(0,(integer, integer2) -> integer+integer2);
        System.out.println(value);
    }

}
