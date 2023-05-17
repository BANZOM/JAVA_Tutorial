class Student {
    String name;
    int age;
}

/**
 * A class to demonstrate the use of array of objects.
 */
public class Array_object {
    /**
     * The main method.
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        // Creating three student objects
        Student s1 = new Student();
        s1.name = "Aditya";
        s1.age = 19;

        Student s2 = new Student();
        s2.name = "Panwar";
        s2.age = 20;

        Student s3 = new Student();
        s3.name = "Banzo";
        s3.age = 21;

        // Creating an array of student objects
        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // Iterating through the array and printing the details of each student
        // for (int i = 0; i < students.length; i++) {
        //     System.out.println(students[i].name + " " + students[i].age);
        // }

        // Enhanced for loop
        for(Student s: students){
            System.out.println(s.name + " " + s.age);
        }
    }
}
