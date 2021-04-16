package com.practice.collection;

import java.util.*;

public class QueueRunner {

    public static void main(String[] args) {
        Queue<String> queue=new PriorityQueue(new QueueComparator());
        queue.addAll(List.of("Amar","Mandar","Abhijit"));
        System.out.println("Original Queue : "+queue);
    }
}

class QueueComparator implements Comparator<String>
{

    @Override
    public int compare(String s, String t1) {
        return Integer.compare(s.length(),t1.length());
    }
}
