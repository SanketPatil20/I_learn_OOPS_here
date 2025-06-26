package Constructors_2;

public class Employee {

    String name;
    int emp_id;

    Employee(String n, int id){
        this.name = n;
        this.emp_id = id;

        System.out.println("Employee added: "+ this.name+ " "+ this.emp_id);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Sanket", 101);
        Employee e2 = new Employee("Aman", 102);

    }
}
