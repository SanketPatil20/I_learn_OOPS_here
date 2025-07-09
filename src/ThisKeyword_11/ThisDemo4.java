package ThisKeyword_11;

class Test{
    Test(ThisDemo4 td ){
        System.out.println("Test class constructor");
    }
}

public class ThisDemo4 {

    void m1(){
        Test t = new Test(this);
    }

    public static void main(String[] args) {

        ThisDemo4 t = new ThisDemo4();
        t.m1();
    }
}

//'this' is used to pass the current object (ThisDemo4) as an argument to another class’s constructor.
