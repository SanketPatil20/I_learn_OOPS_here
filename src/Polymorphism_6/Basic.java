package Polymorphism_6;

class Test {
    void show(){
        System.out.println("Calling from Test");
    }
}

public class Basic extends Test {

    void show(){
        System.out.println("Calling from Basic");
    }

     public static void main(String[] args) {
        Test t = new Test();
        t.show();

        Basic b = new Basic();
        b.show();
    }
}
