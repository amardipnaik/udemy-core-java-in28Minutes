package functionalProgramming.practice;

import java.util.List;
import java.util.function.Predicate;


class prdicateDemo implements Predicate
{
    @Override
    public boolean test(Object o) {
        return false;
    }
}

public class FunctionalProgrammings1 {


    public static void main(String[] args) {
        List<String> listOfAnimal = List.of("Dog", "Cat", "Rat");
        List<Integer> integerList=List.of(5,3,4,5,5);
        listOfAnimal.
                stream().
                filter(
                        element -> element.endsWith("at")).
                forEach(
                        element -> System.out.println(element)
                );

        int sum=integerList.stream().reduce(
                1,(x,y)->x*y
        );

        System.out.println(sum);
    }

}
