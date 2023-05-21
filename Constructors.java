public class Constructors {
    public static void main(String[] args) {
        Details obj1 = new Details("ABC", 10);
        Details obj2 = new Details("XYZ", 100);
        
        System.out.println(obj1.getId() + " : " + obj1.getName());
        System.out.println(obj2.getId() + " : " + obj2.getName());

    }
}

class Details{
    private String name;
    private int id;

    public Details(String nameIN, int idIN) {
        name = nameIN;
        id = idIN;

        System.out.println("in Constructor...");
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    
}
