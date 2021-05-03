package com.practice.test;

public class HelloWorldTraditionalWay implements HelloWorldInterface {

    public static void main(String[] args) {

        HelloWorldTraditionalWay helloWorldTraditionalWay = new HelloWorldTraditionalWay();
        System.out.println(helloWorldTraditionalWay.sayHello());

    }

    @Override
    public String sayHello() {
        return "Hello World";
    }
}
