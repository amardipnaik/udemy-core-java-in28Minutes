package test;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        List<String> strings = List.of("amar", "chitli", "shankar", "mandar");
         strings.stream()
                 //filter(element->element.contains("a"))
                 .map(element->element.contains("a"))
                 .collect(Collectors.toList())
                 .forEach(element-> System.out.println(element));
         ;
        //System.out.println(strings);
    }


}
