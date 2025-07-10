package SuperKeyword_13;

class A {
    int a = 10;
}

public class Super1 extends  A {

    int a = 20;

    void show(int a){
        System.out.println(a);       //30
        System.out.println(this.a);  //20
        System.out.println(super.a); //10
    }

    public static void main(String[] args) {

        Super1 s = new Super1();
        s.show(30);
    }
}
