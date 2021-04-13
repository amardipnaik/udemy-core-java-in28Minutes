package com.practice.arrays;

public class StudentRunner {
    public static void main(String[] args) {
        Student student=new Student("Amar",99,100,90);
        System.out.println(student.getNumberOfMarks());
        System.out.println(student.getTotalMarks());
        System.out.println(student.getMaximunMarks());
        System.out.println(student.getMinimunMarks());
    }
}
