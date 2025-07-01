package Polymorphism_5;

class Test1{
    void show(int a){
        System.out.println("Calling int method");
    }

    void show(String a){
        System.out.println("Calling String method");
    }
}

public class MO_Case1 {

    public static void main(String[] args) {

        Test1 t = new Test1();
        t.show('g'); //char argument provided even though it is available only for int and String
    }
}

//Will give output of int method due to AUTOMATIC PROMOTION