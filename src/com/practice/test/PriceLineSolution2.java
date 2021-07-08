package test;

public class PriceLineSolution2 {

    public static void main(String[] args) {
        String input = "ABCD"; //XYZ,XZY,YZX,YXZ,ZYX,ZXY
        char[] inputValue = input.toCharArray();
        for (int i = 0; i < inputValue.length; i++) {
            String leftSubString = input.substring(0, i);
            String rightSubString = input.substring(i + 1);
            String total = leftSubString + rightSubString;
            System.out.println(inputValue[i] + total);
            permutaionTotal(total+inputValue[i]);
        }



    }

    private static void permutaionTotal(String s) {
    }

    static void permutaionTotal(String value1, String value2)
    {
        System.out.println(value1+value2);

    }
}
