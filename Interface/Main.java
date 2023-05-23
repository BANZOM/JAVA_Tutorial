package Interface;

class Laptops{
    void development() {
        System.out.println("laptop hardware...");
    }
}

class Desktop{
    void development() {
        System.out.println("desktop hardware...");
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
        Desktop desk1 = new Desktop();

        dev1.coding(lap1);
        // dev1.coding(desk1);  not works

        
    }
}
