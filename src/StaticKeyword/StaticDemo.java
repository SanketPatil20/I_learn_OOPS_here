package StaticKeyword;

class Employee {
    int empid;
    String name;
    static String company = "Cisco"; //Company kept static

    void display() {
        System.out.println(empid + " " + name + " " + company);
    }

    Employee(int empid, String name){
        this.empid = empid;
        this.name = name ;
    }
}

public class StaticDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Sanket");
        e1.display();
        Employee e2 = new Employee(102, "Tejas");
        e2.display();

    }
}