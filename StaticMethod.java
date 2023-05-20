class Carss {
    String name;
    int seats;
    int maxSpeed;

    // static method
    static void show(Carss obj) {
        System.out.println(obj.name +" has " + obj.seats + " seats with max speed of " + obj.maxSpeed + " KMPH...");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Carss c1 = new Carss();
        Carss c2 = new Carss();

        // details of c1:
        c1.name = "BMW";
        c1.seats = 4;
        c1.maxSpeed = 200;

        // details of c2:
        c2.name = "Porsche";
        c2.seats = 2;
        c2.maxSpeed = 250;

        // c1.show();
        // c2.show();


        // static objects can be called from class name:
        Carss.show(c1);
        Carss.show(c2);

    }
}
