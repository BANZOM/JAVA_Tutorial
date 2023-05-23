package Interface;

class Laptops{
    void development() {
        System.out.println("laptop hardware...");
    }
}

class Developer{
    void coding(Laptops laptop) {
        System.out.println("Developer is coding...");
    }
}

public class Main {
    public static void main(String[] args) {
        Developer dev1 = new Developer();
        Laptops lap1 = new Laptops();

        dev1.coding(lap1);

        
    }
}
