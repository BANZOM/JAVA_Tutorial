package Enums;

enum BasicEnum{
    ONE,TWO,THREE,START,STOP,TERMINATE,FULL,EMPTY,ETC,UNKNOWN;
}
public class Main1 {
    public static void main(String[] args) {
        BasicEnum e = BasicEnum.ONE;
        System.out.println(e);

        System.out.println(BasicEnum.TWO);
        System.out.println(BasicEnum.THREE);
        System.out.println(BasicEnum.START);
        System.out.println(BasicEnum.STOP);
        System.out.println(BasicEnum.TERMINATE);
        System.out.println(BasicEnum.FULL);
        System.out.println(BasicEnum.EMPTY);
        System.out.println(BasicEnum.ETC);
        System.out.println(BasicEnum.UNKNOWN);

        System.out.println("\n\n\n");

        BasicEnum[] x = BasicEnum.values(); // getting all enums in an array
    }
}
