package ThisKeyword_11;

public class ThisDemo2 {

    ThisDemo2() {
        System.out.println("No argument constructor");
    }

    ThisDemo2(int a) {
        this(); //calling the non parameterized constructor
        System.out.println("Parameterized constructor");
    }

    public static void main(String[] args) {
        ThisDemo2 th = new ThisDemo2(10);
    }
}
