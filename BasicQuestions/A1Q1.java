package BasicQuestions;

import java.util.Scanner;

/*
Write a program to print the area of a rectangle by creating a class named 'Area' taking the 
values of its length and breadth as parameters of its constructor and having a method named 
'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are entered 
through keyboard
*/
class Area {
    int length, breadth;
    Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    int returnArea() {
        return length * breadth;
    }
}

public class A1Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        Area area = new Area(L, B);
        System.out.println("Area of rectangle is " + area.returnArea());
    }
}
