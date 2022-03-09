package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class ComparatorClass implements Comparator<Integer>
{

    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare();
    }

    @Override
    public Comparator<Integer> reversed() {
        return Comparator.super.reversed();
    }
}


public class Test3GSLab {

    public static void main(String[] args) {
        List<Integer> numberList=new ArrayList<>();
        numberList.add(3);
        numberList.add(10);
        numberList.add(1);
        numberList.add(5);
        numberList.add(4);

        System.out.println(numberList.toString());
        numberList.stream().sorted(new ComparatorClass());
        System.out.println(numberList.toString());


    }


}


