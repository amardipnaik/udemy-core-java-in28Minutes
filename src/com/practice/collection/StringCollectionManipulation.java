package com.practice.collection;

import java.util.HashMap;
import java.util.Map;

public class StringCollectionManipulation {

    public static void main(String[] args) {
        String str = "I want to find character and words of this string";
        StringCollectionManipulation.findCharInString(str);
        StringCollectionManipulation.findWordsInString(str);
    }

    public static void findCharInString(String str) {
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (Character character : chars) {
            Integer charCount = map.get(character);
            if (null == charCount) {
                map.put(character, 1);
            } else {
                map.put(character, charCount + 1);
            }
        }
        System.out.println("Character Count :" + map);
    }

    public static void findWordsInString(String str) {
        String[] splitStr = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String string : splitStr) {
            Integer strCount = map.get(string);
            if (null == strCount) {
                map.put(string, 1);
            } else {
                map.put(string, strCount + 1);
            }
        }
        System.out.println("String Count :" + map);
    }

}
