package BasicQuestions;
/*
Write a program that would print the information (name, year of joining, salary, address)
of three employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
*/
class Employee {
    String name, address;
    int year;
    Employee(String name, int year, String address) {
        this.name = name;
        this.year = year;
        this.address = address;
    }

    void printInfo() {
        System.out.println(name + "\t\t" + year + "\t\t" + address);
    }


}
public class A1Q4 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Robert", 1994, "64C- WallsStreat");
        employees[1] = new Employee("Sam", 2000, "68D- WallsStreat");
        employees[2] = new Employee("John", 1999, "26B- WallsStreat");
        System.out.println("Name\t\tYear of Joining\t\tAddress");
        for (Employee employee : employees) {
            employee.printInfo();
        }
    }
}
