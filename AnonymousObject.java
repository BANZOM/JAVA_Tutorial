class Anonymous{

    Anonymous() {
        System.out.println("Object Created");
    }
    public void show(){
        System.out.println("I am an anonymous object.");
    }

}
public class AnonymousObject {
    public static void main(String[] args) {

        // About Anonymous Object:
        // Anonymous object is an object that has no name.
        // Anonymous object can be used only once.
        // have no incoming refrence
        // Anonymous object is eligible for garbage collection after the method call is over.

        // Example:
        new Anonymous();
        new Anonymous().show();

        // each time new object is created and then it can't be used later on
    }
}
