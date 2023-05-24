package Interface;

interface Animal{
    int avgWeight = 100;
    void eat();
    void sleep();
}

interface Human{
    int avgWeight = 50;
    void eat();
    void think();
}

class Amain3 implements Animal,Human{
    public void eat(){
        System.out.println("Eating...");
    }

    public void sleep(){
        System.out.println("Sleeping...");
    }

    public void think(){
        System.out.println("Thinking...");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Amain3 obj = new Amain3();
        obj.eat();
        obj.sleep();
        obj.think();
        System.out.println("Average weight of human: " + Human.avgWeight);
        System.out.println("Average weight of animal: " + Animal.avgWeight);

        // Human.avgWeight = 70; // cannot update as its final and static
        // Animal.avgWeight = 150; // cannot update as its final and static

    }
    
}
