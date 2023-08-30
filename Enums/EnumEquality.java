package Enums;

public class EnumEquality {
    public static void main(String[] args) {
        BasicEnum a = BasicEnum.START;
        BasicEnum b = BasicEnum.START;

        if (a == b)
            System.out.println("==");
        
        if(a.equals(b))
            System.out.println("equals");
    }
}
