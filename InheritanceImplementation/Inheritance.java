package InheritanceImplementation;


public class Inheritance {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(1, 2));
        System.out.println(c.subtract(1, 2));

        AdvCalc ac = new AdvCalc();
        System.out.println(ac.multi(1, 2));
        System.out.println(ac.div(1, 2));

        // Inheritance
        // Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object.
        // The idea behind inheritance in Java is that you can create new classes that are built upon existing classes.
        // When you inherit from an existing class, you can reuse methods and fields of the parent class.
        // Moreover, you can add new methods and fields in your current class also.


        // below only works when we use "extend" keyword
        AdvCalc m = new AdvCalc();
        System.out.println(m.add(1, 2));
        System.out.println(m.subtract(1, 2));
    }
}