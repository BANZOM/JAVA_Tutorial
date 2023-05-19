public class immutability_checking {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "Hello";

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false

        s3 = "hello";
        System.out.println(s1 == s3); // true

        // here the object "Hello" will goes under Garbage collector from the string constant pool;
        // as the String is immutable
        // so we have stringbuffer and stringbuilder for mutable strings

    }
}
