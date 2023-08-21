import java.util.*;

class Students implements Comparable<Students> {
    int roll;
    String name;

    Students(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return roll + " : " + name;
    }

    @Override
    public int compareTo(Students that) {
        if (this.roll > that.roll) {
            return 1;
        }
        return -1;
    }


}

public class F6_Comparable {
    public static void main(String[] args) {

        Comparator<Students> comp = (o1, o2) -> (o1.name.length() > o2.name.length()) ? 1 : -1;

        // Here we'll try to use the Comparable interface for our own classes 
        List <Students> list = new ArrayList<>();

        list.add(new Students(12, "Aditya"));
        list.add(new Students(29, "Rahul"));
        list.add(new Students(3, "Sonam"));
        list.add(new Students(14, "Amit"));
        list.add(new Students(25, "Sun"));

        System.out.println("Original List:");
        for (Students s : list) {
            System.out.println(s);
        }
        System.out.println("------------");

        Collections.sort(list);

        System.out.println("Sorted by roll:");
        for (Students s : list) {
            System.out.println(s);
        }
        System.out.println("------------");


        // Using comparator with strings to sort it as per string length
        Collections.sort(list, comp);

        System.out.println("Sorted by name length:");
        for (Students s : list) {
            System.out.println(s);
        }
    }
}
