package Threads;

class X extends Thread{
    public void run() {

        for (int i = 0; i < 50; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class Y extends Thread{
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("GoodBye");
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThread1 {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();

        x.start();
        y.start();
    }
}
