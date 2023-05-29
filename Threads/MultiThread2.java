package Threads;

class AThread2 extends Thread{
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

class BThread2 extends Thread{
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
        AThread2 t1 = new AThread2();
        BThread2 t2 = new BThread2();

        t1.start();
        t2.start();
    }
}
