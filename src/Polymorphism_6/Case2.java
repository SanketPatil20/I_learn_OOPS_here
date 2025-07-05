package Polymorphism_6;

class Parent {
    void show() {
        System.out.println("Calling from Parent class");
    }
}

class Child extends Parent {
    void show() {
        // Using show keyword to call parent class method in child class
        super.show();
        System.out.println("Calling from Child class");
    }
}

public class Case2 {

    public static void main(String[] args) {
        Child ch = new Child();
        ch.show();
    }
}
