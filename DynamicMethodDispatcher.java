class Dmd_parent{
    void show(){
        System.out.println("in Parent Show...");
    }
}
class Dmd_child extends Dmd_parent{
    void show(){
        System.out.println("in Child Show...");
    }
}

class Dmd_grand_child extends Dmd_child{
    void show(){
        System.out.println("in Grand Child Show...");
    }
}

public class DynamicMethodDispatcher {
    public static void main(String[] args) {
        
    }
}
