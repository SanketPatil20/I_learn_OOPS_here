package Encapsulation_9;

class Company {
    private int empId;

    //Setting getter and setter methods
    public void setEmpId(int empId1) {
        empId = empId1;
    }

    public int getEmpId() {
        return empId;
    }
}

public class Employee {

    public static void main(String[] args) {

        Company c1 = new Company();
        c1.setEmpId(101);
        System.out.println("Employee id is: " + c1.getEmpId());

    }
}
