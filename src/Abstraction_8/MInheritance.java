package Abstraction_8;

interface M1 {
    void show();          // Common method
    void display();       // Unique to M1
}

interface M2 {
    void show();          // Same method name & signature as in M1
}

public class MInheritance implements M1, M2 {

    // One implementation satisfies both M1 and M2
    public void show() {
        System.out.println("Implemented show() from both M1 and M2");
    }

    // Implementing display() from M1
    public void display() {
        System.out.println("Implemented display() from M1");
    }

    public static void main(String[] args) {
        MInheritance mi = new MInheritance();
        mi.show();      // Calls the shared method
        mi.display();   // Calls the unique method
    }
}

//If two interfaces have the same method signature,
//a class implementing both needs to provide only one implementation.
//This is legal in Java and does not cause ambiguity in case of multiple inheritance.