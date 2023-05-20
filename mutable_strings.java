public class mutable_strings {
    public static void main(String[] args) {
        
        // Mutable Strings are formed by StringBuffer and StringBuilder
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder();

        System.out.println(sb2.capacity());

        // Operations:
        System.out.println(sb1.hashCode());
        sb1.append(" is the instance");

        System.out.println(sb1.hashCode());
        System.out.println(sb1);

        // Insert
        sb1.insert(5, " World");
        System.out.println(sb1);
    }
}