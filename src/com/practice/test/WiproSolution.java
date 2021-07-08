package test;

import java.util.ArrayList;
import java.util.List;

public class WiproSolution {

    public static void main(String[] args) {
        String input = " I am working in wipro";
        //Output: wipro in working am I
        char[] inputArray = input.toCharArray();
        String result = "";
        StringBuilder sf = new StringBuilder();
        //sf.append(input);
        //System.out.println(Arrays.toString(input.split(" ")));
        List<String> stringList = new ArrayList<>();

        String[] arrays = input.split(" ");
        for (int i=arrays.length-1;i>0;i--) {
            result = result +" "+ arrays[i];
        }
        System.out.println(result);
    }

}
