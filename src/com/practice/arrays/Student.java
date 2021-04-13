package com.practice.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Student {
    ArrayList<Integer> marksList = new ArrayList<Integer>();
    String name = new String();

    public Student(String name, Integer... marks) {
        this.name = name;
        Collections.addAll(this.marksList, marks);
    }

    public int getNumberOfMarks() {
        return marksList.size();
    }

    public int getTotalMarks() {
        int totalMarks = 0;
        for (Integer mark : marksList) {
            totalMarks += mark;
        }
        return totalMarks;
    }

    public int getMaximunMarks() {
        return Collections.max(marksList);
    }
    public int getMinimunMarks() {
        return Collections.min(marksList);
    }
}
