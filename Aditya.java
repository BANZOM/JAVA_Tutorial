interface Human {
    void eat();
    void sleep();
    void walk();
}

interface God {
    void sleep();
    void walk();
    void fly();
}

class Adi implements Human, God {
    public void eat() {
        System.out.println("Eating on couch");
    }
    public void sleep() {
        System.out.println("Sleeping");
    }
    public void walk() {
        System.out.println("Walking");
    }
    public void fly() {
        System.out.println("Flying");
    }
}


public class Aditya {
    public static void main(String[] args) {
        
        Adi a = new Adi();
        a.eat();
        a.sleep();
        a.walk();
        a.fly();

    }
}
