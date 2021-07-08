package test;


class HelloCodiva {

    public static void main(String[] args) {

        System.out.println("Hello Codiva");

    }

    public static int findJudge(int N, int[][] trust) {

        if (trust.length == 0 && N == 1) {
            return 1;
        }
        int[] input = new int[N + 1];
        int[] output = new int[N + 1];

        for (int[] array : trust) {
            input[array[1]]++;
            output[array[0]]++;
        }
        /*
        *  input[array]==n-1 (everyone trust town judge)
        *  town judge do not trust anyone ouput[arryay]==o         * */
        for (int i = 1; i <= N; i++) {

        }


        return -1;
    }

}
