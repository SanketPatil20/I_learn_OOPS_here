package Polymorphism_5;

class Test{
    void show(){
        System.out.println("Calling without arguments");
    }

    void show(int a){
        System.out.println("Calling with int argument");
    }
}


public class MethodOverloading {

    public static void main(String[] args) {
        Test t = new Test();
        t.show(1);
    }
}
