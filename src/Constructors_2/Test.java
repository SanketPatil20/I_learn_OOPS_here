package Constructors_2;

import java.sql.SQLOutput;

public class Test {

//    Test(){
//        System.out.println("Calling from no argument constructor");
//    }

    Test(int a){
        System.out.println("Calling from parameterized constructor");
    }

    public static void main(String[] args) {

        Test t = new Test(10);
    }

}
