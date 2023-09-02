public class MoreStrings {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1;

        System.out.println(s1); // "Hello"
        System.out.println(s2); // "Hello"

        s1 = s1.concat("World");

        System.out.println(s1); // "HelloWorld"
        System.out.println(s2); // "Hello"
    }
}
