class Cars{
    String name;
    int seats;
    int maxSpeed;
    static int tyres; // observing all cars have 4 tyres, making it static
    int noOfLights;

    void show() {
        System.out.println(name +" has " + seats + " seats with max speed of " + maxSpeed + " KMPH with " + tyres + " tyres and " + noOfLights + " lights...");
    }
}

public class Static_and_Instance_var {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        Cars car2 = new Cars();

        Cars.tyres = 4;

        car1.name = "BMW";
        car1.seats = 4;
        car1.maxSpeed = 200;
        car1.noOfLights = 4;

        car2.name = "Porsche";
        car2.seats = 2;
        car2.maxSpeed = 250;
        car2.noOfLights = 8;

        car1.show();
        car2.show();
    }
}
