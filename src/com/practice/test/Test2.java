package test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    //SecondLargetstElement

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(5);
        integerList.add(7);
        integerList.add(4);

        int secondLargets = 0;
        int fisrtLargets = 0;

        for (int value : integerList) {
            if (value > fisrtLargets) {
                fisrtLargets = value;
            }
        }
        for (int value : integerList) {
            if (value > secondLargets && value!=fisrtLargets) {
                secondLargets = value;
            }
        }
        System.out.println(secondLargets);
    }

}
