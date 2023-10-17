package BasicQuestions;
/*
Print the average of three numbers entered by user by creating a class named 'Average' 
having a method to calculate and print the average.
*/

import java.util.Scanner;

class Average {
    int a, b, c;
    Average(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void printAverage() {
        System.out.print((a + b + c) / 3.0);
    }
}

public class A1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        Average average = new Average(a, b, c);

        average.printAverage();
    }
}
