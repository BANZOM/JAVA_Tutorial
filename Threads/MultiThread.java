package Threads;

class X {
    void run() {
        System.out.println("Hello");
    }
}

class Y {
    void run() {
        System.out.println("GoodBye");
    }
}

public class MultiThread {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        
        x.run();
        y.run();
    }
}
