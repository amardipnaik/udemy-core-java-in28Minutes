package com.practice.functionalProgramming;

public class HelloWorldClassWithFp {
    public static void main(String[] args) {
        HelloWorldInterface helloWorldInterface = () -> "Hello World";
        System.out.println(helloWorldInterface.helloWorld());
    }
}
