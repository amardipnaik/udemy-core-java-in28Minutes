package com.practice.generics;

public class GenericsRunner<T> {

    public static void main(String[] args) {
        MyList<String> myList=new MyList<String>();
        myList.add("Amar");
        myList.add("abhi");
        MyList<Integer> integerMyList=new MyList<>();
        integerMyList.add(10);
        integerMyList.add(20);
        System.out.println(myList);
        System.out.println(integerMyList);

        GenericsRunner genericsRunner=new GenericsRunner();
        genericsRunner.printValue(10);
        genericsRunner.printValue("amar");

    }

    public void printValue(T value)
    {
        System.out.println("value is "+value);

    }
}
