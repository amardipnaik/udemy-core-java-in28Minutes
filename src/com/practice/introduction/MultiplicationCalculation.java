package com.practice.introduction;

public class MultiplicationCalculation {

    public static void solution(int table, int start, int stop) {
        for (int i = start; i <= stop; i++) {
            System.out.printf("%d * %d = %d", table, i, (table * i)).println();
        }
    }
}
