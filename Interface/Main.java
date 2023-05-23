package Interface;

class Computer{
    void development() {
    }
}
class Laptops extends Computer{
    void development() {
        System.out.println("laptop hardware...");
    }
}

class Desktop extends Computer{
    void development() {
        System.out.println("desktop hardware...");
    }
}

class Developer{
    void coding(Computer machine) {
        machine.development();
        System.out.println("Developer is coding...");
    }
}

public class Main {
    public static void main(String[] args) {
        Computer lap1 = new Laptops(); 
        Computer desk1 = new Desktop();
        
        Developer dev1 = new Developer();

        dev1.coding(desk1);
        

        
    }
}
