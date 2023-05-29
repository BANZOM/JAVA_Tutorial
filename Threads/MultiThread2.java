package Threads;

class AThread2 implements Runnable{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BThread2 implements Runnable{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("GoodBye");
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class MultiThread2 {
    public static void main(String[] args) {
        Runnable t1 = new AThread2();
        Runnable t2 = new BThread2();


        Thread t1Thread = new Thread(t1);
        Thread t2Thread = new Thread(t2);

        t1Thread.start();
        t2Thread.start();
    }
}
