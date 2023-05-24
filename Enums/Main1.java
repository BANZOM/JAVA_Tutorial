package Enums;

public class Main1 {
    public static void main(String[] args) {
        BasicEnum e = BasicEnum.START;
        System.out.println(e);

        System.out.println(BasicEnum.STOP);
        System.out.println(BasicEnum.TERMINATE);
        System.out.println(BasicEnum.FULL);
        System.out.println(BasicEnum.EMPTY);
        System.out.println(BasicEnum.ETC);
        System.out.println(BasicEnum.UNKNOWN);

        System.out.println("\n\n\n");

        BasicEnum[] x = BasicEnum.values(); // getting all enums in an array

        for(BasicEnum i: x) {
            System.out.println(i.ordinal() +" : " + i);
        }


    }
}
