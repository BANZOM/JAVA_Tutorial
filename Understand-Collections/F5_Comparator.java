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
    }
}
