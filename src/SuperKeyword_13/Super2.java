package SuperKeyword_13;

class B {
    void m1() {
        System.out.println("I am in class B");
    }
}

public class Super2 extends B {

    void m1() {
        System.out.println("I am in class Super2");
    }

    void show() {
        m1();
        super.m1();
    }

    public static void main(String[] args) {

        Super2 s2 = new Super2();
        s2.show();
    }
}
