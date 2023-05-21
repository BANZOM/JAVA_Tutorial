class StoreDetails {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

public class IncapsulationImplement {
    public static void main(String[] args) {
        StoreDetails p1 = new StoreDetails();
        StoreDetails p2 = new StoreDetails();

        System.out.println(p1.getId());
        System.out.println(p1.getName());
        
    }
}
