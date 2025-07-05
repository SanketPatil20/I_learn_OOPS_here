package Polymorphism_6;

class Test1{
    Object show(){
        System.out.println("Calling from show");
        return null;
    }
}

class Xyz extends Test1{
    String show(){
        System.out.println("Calling from Xyz");
        return null;
    }
}

public class Case1 {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.show();

        Xyz ob = new Xyz();
        ob.show();
    }
}