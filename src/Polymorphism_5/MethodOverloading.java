package Polymorphism_5;

class Test{

    // method overloading with same method show();

    void show(){ // 0 arguments
        System.out.println("Calling without arguments");
    }

    void show(int a){ // 1 argument
        System.out.println("Calling with int argument");
    }

    void show(String b){ // 1 argument
        System.out.println("Calling with string argument");
    }

    void show(int c,String d){ // 1 argument
        System.out.println("Calling with first argument int and second string");
    }

}


public class MethodOverloading {

    public static void main(String[] args) {
        Test t = new Test();

        t.show(1);
        t.show("Hello there !!!");
        t.show(10,"Apples");

    }
}
