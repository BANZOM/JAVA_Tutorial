import java.util.*;

class Students {
    private int roll;
    private String name;

    Students(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return roll + " : " + name;
    }



}

public class F6_Comparable {
    public static void main(String[] args) {
        
        // Here we'll try to use the Comparable interface for our own classes 
        List <Students> list = new ArrayList<>();

        list.add(new Students(1, "Aditya"));
        list.add(new Students(2, "Rahul"));
        list.add(new Students(3, "Sonam"));
        list.add(new Students(4, "Amit"));
        list.add(new Students(5, "Sun"));

        for (Students s : list) {
            System.out.println(s);
        }
    }
}
