package InheritanceImplementation;


public class Inheritance {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(1, 2));
        System.out.println(c.subtract(1, 2));

        AdvCalc ac = new AdvCalc();
        System.out.println(ac.multi(1, 2));
        System.out.println(ac.div(1, 2));
    }
}