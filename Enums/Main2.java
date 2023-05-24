package Enums;

public class Main2 {
    public static void main(String[] args) {
        BasicEnum e = BasicEnum.UNKNOWN;
        
        switch (e) {
            case START:
                System.out.println("The process is Started...");
                break;
            case STOP:
                System.out.println("The process is Stopped");
                break;
            case TERMINATE:
                System.out.println("The process is Terminated");
                break;
            case FULL:
                System.out.println("The process is Full");
                break;
            case EMPTY:
                System.out.println("The process is Empty");
                break;
            case ETC:
                System.out.println("Rest are ETC");
                break;
            case UNKNOWN:
                System.out.println("Unknown enum");
                break;
            default:
                break;
        }
    }
}
