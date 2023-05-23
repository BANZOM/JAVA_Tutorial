package WrapperClass;

public class Main {
    public static void main(String[] args) {
        
        int n = 10;
        Integer wn1 = n;  // autoboxing
        Integer wn2 = new Integer(n); // boxing but deprecated
        System.out.println(wn1);
        System.out.println(wn2);

        int pn1 = wn1.intValue(); // unboxing
        int pn2 = wn2;   // auto unboxing
        System.out.println(pn1);
        System.out.println(pn2);

        String s = "123";
        Integer wn3 = Integer.valueOf(s);
        int pn3 = Integer.parseInt(s);
        System.out.println(wn3);
        System.out.println(pn3);
        
    }
}
