package SuperKeyword_12;

class A {
    int i = 20;  // 'i' defined in superclass A
}

public class SuperK extends A {

    int i = 10;

    void show(int i) {
        // 'super.i' refers to the 'i' variable in the superclass A
        System.out.println(super.i);  // Output will be 20
    }

    public static void main(String[] args) {

        SuperK s = new SuperK();

        // Calling show method with argument of any integer
        s.show(100);
    }
}
