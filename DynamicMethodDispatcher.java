class Dmd_parent{
    void show(){
        System.out.println("in Parent Show...");
    }
}
class Dmd_child extends Dmd_parent{
    @Override
    void show(){
        System.out.println("in Child Show...");
    }
}

class Dmd_grand_child extends Dmd_child{
    @Override
    void show(){
        System.out.println("in Grand Child Show...");
    }
}

public class DynamicMethodDispatcher {
    public static void main(String[] args) {
        // create an object of type Dmd_parent and assign it to a variable of type Dmd_parent
        Dmd_parent obj = new Dmd_grand_child();
        // call the show method on the object
        obj.show();

        // create an object of type Dmd_child and assign it to a variable of type Dmd_parent
        obj = new Dmd_child();
        // call the show method on the object
        obj.show();

        // create an object of type Dmd_parent and assign it to a variable of type Dmd_parent
        obj = new Dmd_parent();
        // call the show method on the object
        obj.show();


        // From all above:
        // we can do method dispatching at the runtime
        // ParentClass object = new ChildClass; then this object is eligible to change its object ref.
    }
}
