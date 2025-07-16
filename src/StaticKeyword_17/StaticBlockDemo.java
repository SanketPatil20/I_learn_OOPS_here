package StaticKeyword_17;

public class StaticBlockDemo {

    static{
        System.out.println("Hello there!! Its static block");
    }

    public static void main(String[] args) {
        System.out.println("Calling from main method....");
    }

    static { //It will be called before the main method
        System.out.println("I am another static block.");
    }

}
