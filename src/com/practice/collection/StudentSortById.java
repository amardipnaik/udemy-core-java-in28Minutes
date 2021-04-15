package com.practice.collection;

import java.util.Comparator;

public class StudentSortById implements Comparator<Student> {

    @Override
    public int compare(Student student, Student t1) {
        return Integer.compare(student.getId(),t1.getId());
    }
}
