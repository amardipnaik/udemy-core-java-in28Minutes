package com.practice.generics;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {

    List<T> list = new ArrayList();

    public void add(T value) {
        list.add(value);
    }

    public void remove(T value) {
        list.remove(value);
    }

    @Override
    public String toString() {
        return "MyList{" +
                "list=" + list +
                '}';
    }
}
