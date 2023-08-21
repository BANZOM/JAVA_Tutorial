import java.util.*;

class Students {
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



}

public class F6_Comparable {
    public static void main(String[] args) {
        
        // Here we'll try to use the Comparable interface for our own classes 
        List <Students> list = new ArrayList<>();

        list.add(new Students(12, "Aditya"));
        list.add(new Students(29, "Rahul"));
        list.add(new Students(3, "Sonam"));
        list.add(new Students(14, "Amit"));
        list.add(new Students(25, "Sun"));

        for (Students s : list) {
            System.out.println(s);
        }

        Collections.sort(list, new Comparator<Students>() {
            public int compare(Students o1, Students o2) {
                if (o1.roll > o2.roll) {
                    return 1;
                }
                return -1;
            }
        });

        for (Students s : list) {
            System.out.println(s);
        }
    }
}
