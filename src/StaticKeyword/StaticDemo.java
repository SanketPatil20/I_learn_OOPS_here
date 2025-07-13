package StaticKeyword;

class Student {
    int rollNo;
    String name;
    static String college; // static variable shared by all students

    // Static block to initialize static data
    static {
        college = "Tech University";
        System.out.println("Static block executed: College initialized.");
    }

    // Constructor
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Static method
    static void changeCollege(String newCollege) {
        college = newCollege;
    }

    // Instance method
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice");
        Student s2 = new Student(102, "Bob");

        s1.display();
        s2.display();

        System.out.println("--- Changing college name using static method ---");
        Student.changeCollege("Code Academy");

        s1.display();
        s2.display();
    }
}

