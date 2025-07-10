package SuperKeyword_13;

class C {
    // Constructor of class C
    C() {
        System.out.println("I am in class C");
    }
}

public class Super3 extends C {

    // Constructor of subclass Super3
    Super3() {
        // Implicit call to super() happens here,
        // which invokes the parent class constructor first
        System.out.println("I am from class Super3");
    }

    public static void main(String[] args) {

        Super3 s3 = new Super3();

        // Output:
        // I am in class C        ← called first (from parent class)
        // I am from class Super3 ← called after (from child class)
    }
}
