package com.practice.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterationTypes {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<String, Integer>();
        marks.put("Amar", 100);
        marks.put("abhi", 99);
        marks.put("shankar", 90);
        marks.put("mandar", 98);
        MapIterationTypes.mapIterationWithEntrySet4(marks);
    }

    public static void mapIterationWithEntrySet(Map marks) {
        for (Object entry : marks.entrySet()) {
            System.out.println("Results : " + entry.toString());
        }
    }

    public static void mapIterationWithEntrySet2(Map marks) {
        for (Object name : marks.keySet())
            System.out.println("key: " + name);

        // using values() for iteration over values
        for (Object mark : marks.values())
            System.out.println("value: " + mark);
    }

    public static void mapIterationWithEntrySet3(Map marks) {
        // using iterators
        Iterator<Map.Entry<String, Integer>> itr = marks.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
    }

    public static void mapIterationWithEntrySet4(Map marks) {
        // looping over keys
        for (Object name : marks.keySet()) {
            // search  for value
            Integer mark = (Integer) marks.get(name);
            System.out.println("Key = " + name + ", Value = " + mark);
        }
    }
}
