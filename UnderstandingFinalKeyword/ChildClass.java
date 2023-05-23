package UnderstandingFinalKeyword;
import UnderstandingPackage.Package1.Print;

public final class ChildClass extends ParentClass{

    // void print() { // error: print() in ChildClass cannot override print() in ParentClass
    //     System.out.println("ChildClass");
    // }

    void printStar() {
        System.out.println("*********");
    }
}
