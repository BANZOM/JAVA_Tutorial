package BasicQuestions;
/*
Add two distances in inch-feet by creating a class named 'AddDistance'.
*/

class AddDistance {
    int feet, inch;
    AddDistance(int feet, int inch) {
        this.feet = feet;
        this.inch = inch;
    }
    AddDistance add(AddDistance d) {
        AddDistance sum = new AddDistance(0, 0);
        sum.feet = this.feet + d.feet;
        sum.inch = this.inch + d.inch;
        if (sum.inch >= 12) {
            sum.feet += sum.inch / 12;
            sum.inch %= 12;
        }
        return sum;
    }
    void display() {
        System.out.println("Sum of distances is " + this.feet + " feet " + this.inch + " inches");
    }
}

public class A1Q5 {
    public static void main(String[] args) {
        AddDistance d1 = new AddDistance(5, 11);
        AddDistance d2 = new AddDistance(6, 5);
        AddDistance sum = d1.add(d2);
        sum.display();
    }
}
