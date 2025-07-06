package Abstraction_8;

interface I1{
    void show();
}

public class Interfaces implements I1 {

    public void show(){
        System.out.println("Calling from interfaces class");
    }

    public static void main(String[] args) {
        Interfaces I = new Interfaces();
        I.show();
    }
}
