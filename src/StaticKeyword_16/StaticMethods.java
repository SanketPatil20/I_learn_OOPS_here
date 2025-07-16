package StaticKeyword_16;

class Test {
    static void display() {
        System.out.println("1");
    }
}


public class StaticMethods {

    public static void main(String[] args) {
//        Test t = new Test();
        Test.display(); //Calling static method directly without creating an object
    }

}
