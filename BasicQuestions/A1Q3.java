package BasicQuestions;
/*
Print the sum, difference and product of two complex numbers by creating a class named
'Complex' with separate methods for each operation whose real and imaginary parts are entered
by user.
*/
class Complex {
    int real, imaginary;
    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    void sum(Complex c1, Complex c2) {
        System.out.println("Sum: " + (c1.real + c2.real) + " + " + (c1.imaginary + c2.imaginary) + "i");
    }
    void difference(Complex c1, Complex c2) {
        System.out.println("Difference: " + (c1.real - c2.real) + " + " + (c1.imaginary - c2.imaginary) + "i");
    }
    void product(Complex c1, Complex c2) {
        System.out.println("Product: " + (c1.real * c2.real - c1.imaginary * c2.imaginary) + " + " + (c1.real * c2.imaginary + c1.imaginary * c2.real) + "i");
    }
}
public class A1Q3 {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, 5);
        c1.sum(c1, c2);
        c1.difference(c1, c2);
        c1.product(c1, c2);
    }
}
