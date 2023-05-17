class Student {
    String name;
    int age;
}

public class Array_object {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aditya";
        s1.age = 19;

        Student s2 = new Student();
        s2.name = "Panwar";
        s2.age = 20;

        Student s3 = new Student();
        s3.name = "Banzo";
        s3.age = 21;

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " " + students[i].age);
        }
    }
}