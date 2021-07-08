package test;

class EvenThread extends Thread {

    public void run() {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}

class OddThread extends Thread {

    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

}
public class SolutionPriceLine {

    public static void main(String[] args) {

        Thread evenThread = new EvenThread();
        evenThread.start();
        Thread oddThread = new OddThread();
        oddThread.start();
        //evenThread.join(oddThread);
    }

}
