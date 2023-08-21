import java.util.*;

public class F5_Comparator {
    public static void main(String[] args) {

        Comparator<Integer> comp = new Comparator<Integer>() {

            /**
             * + * Compares two Integers based on their remainder when divided by 10.
             * + *
             * + * @param o1 the first Integer to be compared
             * + * @param o2 the second Integer to be compared
             * + * @return a positive integer if o1%10 > o2%10, otherwise a negative integer
             * +
             */
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 > o2 % 10) {
                    return 1;
                }
                return -1;
            }
        };

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(26);
        list.add(3);
        list.add(49);
        list.add(35);

        System.out.println(list);

        // Sorting the list
        Collections.sort(list);
        System.out.println(list);

        // Sorting of list with respect to own logic of sort
        Collections.sort(list, comp);
        System.out.println(list);



        // Using comparator with strings
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Aditya");
        strList.add("Rahul Dube");
        strList.add("Sonam");
        strList.add("Amit");
        strList.add("Sun");

        System.out.println(strList);

        // Sort the list as per alphabet
        Collections.sort(strList);
        System.out.println(strList);


        // Sorting as per the length of the string
        Collections.sort(strList, new Comparator<String>() {
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) {
                    return 1;
                }
                return -1;
            }
        });

        System.out.println(strList);


    }
}
