package FinalKeyword;

class Demo {
    final void m1(){
        System.out.println("Calling from class Demo");
    }
}

public class Test extends Demo {

    //overriding m1 method here
    //Error: cannot override m1() in FinalKeyword.Demo overridden method is final
//    void m1(){
//        System.out.println("Calling from class Test");
//    }


    public static void main(String[] args) {

        final int i = 10;

//        i = i + 20; Error: cannot assign a value to final variable i

        System.out.println(i);

//        Test t = new Test();
//        t.m1();
    }
}
