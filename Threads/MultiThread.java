package Threads;

class X extends Thread{
    public void run() {

        for (int i = 0; i < 50; i++) {
            System.out.println("Hello");
        }

    }
}

class Y extends Thread{
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("GoodBye");
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();

        x.start();
        y.start();
    }
}
