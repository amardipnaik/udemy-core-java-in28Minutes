package com.practice.conditions;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Welcome to Calculator Program");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter Second Number : ");
        int number2 = scanner.nextInt();
        System.out.println("Chose Operations : ");
        System.out.println("1:add");
        System.out.println("2:subtract");
        System.out.println("3:multiply");
        System.out.println("4:divide");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: {
                System.out.println(number1 + number2);
                break;
            }
            case 2: {
                System.out.println(number1 - number2);
                break;
            }
            case 3: {
                System.out.println(number1 * number2);
                break;
            }
            case 4: {
                System.out.println(number1 / number2);
                break;
            }
            default: {
                System.out.println("Invalid Operation");
            }
        }
    }
}
