package thread;

class MyThread extends Thread {

    public void run() {
        for (int i = 301; i <= 400; i++) {
            System.out.print(i + " ");
        }
        System.out.println("Third Complete");
    }
}

class MyRunnable implements Runnable {

    public void run() {
        for (int i = 201; i <= 300; i++) {
            System.out.print(i + " ");
        }
        System.out.println("Second Complete");
    }
}

public class ThreadBasic {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();
        MyRunnable myRunnable= new MyRunnable();
        Thread threadRunnable=new Thread(myRunnable);
        threadRunnable.start();
        for (int i = 101; i <= 200; i++) {
            System.out.print(i + " ");
        }
        System.out.println("First Complete");
    }
}
