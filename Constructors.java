public class Constructors {
    public static void main(String[] args) {
        Details obj1 = new Details("ABC", 10);
        Details obj2 = new Details("XYZ", 100);
        Details obj3 = new Details();
        
        System.out.println(obj1.getId() + " : " + obj1.getName());
        System.out.println(obj2.getId() + " : " + obj2.getName());
        System.out.println(obj3.getId() + " : " + obj3.getName());

    }
}

class Details{
    private String name;
    private int id;

    public Details(String nameIN, int idIN) {  // Parameterized constructor
        name = nameIN;
        id = idIN;

        System.out.println("in Parameterized Constructor...");
    }

    public Details() {  // Default constructor
        name = "default";
        id = 0;

        System.out.println("in Default Constructor...");
    }
    
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    
}
