package com.practice.functionalProgramming;

public class HelloWorldTraditionalClass implements HelloWorldInterface {

    public static void main(String[] args) {
        HelloWorldTraditionalClass helloWorldTraditionalClass = new HelloWorldTraditionalClass();
        System.out.println(helloWorldTraditionalClass.helloWorld());
    }

    @Override
    public String helloWorld() {
        return "Hello World";
    }
}
