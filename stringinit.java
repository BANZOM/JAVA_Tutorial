public class stringinit {
    public static void main(String[] args) {

        // string object
        String s = "hello";
        // string new object
        String s1 = new String("hello");
        
        // printing
        System.out.println(s);
        System.out.println(s1);

        // printing hashcodes
        System.out.println("The Hashcode of s is " + s.hashCode());

    }
}