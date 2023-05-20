class Cars{
    String name;
    int seats;
    int maxSpeed;
    int tyres;
    int noOfLights;

    void show() {
        System.out.println(name +" has " + seats + " seats with max speed of " + maxSpeed + " KMPH with " + tyres + " tyres and " + noOfLights + " lights...");
    }
}

public class Static_and_Instance_var {
    public static void main(String[] args) {
        Cars car1 = new Cars();

        car1.name = "BMW";
        car1.seats = 4;
        car1.maxSpeed = 200;
        car1.tyres = 4;
        car1.noOfLights = 4;

        car1.show();
    }
}
