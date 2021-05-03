package com.practice.test;

public class HelloWorldFunctioanlProgramming {

    public static void main(String[] args) {

        HelloWorldInterface helloWorldInterface = () -> "Hello World Functional Programming";

        System.out.println(helloWorldInterface.sayHello());

    }
}
