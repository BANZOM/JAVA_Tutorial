class StoreDetails {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class IncapsulationImplement {
    public static void main(String[] args) {
        StoreDetails p1 = new StoreDetails();
        StoreDetails p2 = new StoreDetails();

        p1.setName("P1");
        p1.setId(11111);
        p2.setName("p2");
        p2.setId(22222);

        System.out.println(p1.getId() + " : " + p1.getName());
        System.out.println(p2.getId() + " : " + p2.getName());

        // p1.name --> error
    }
}
