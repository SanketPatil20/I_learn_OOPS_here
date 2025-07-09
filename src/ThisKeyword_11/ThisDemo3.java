package ThisKeyword_11;

public class ThisDemo3 {

    void m1(ThisDemo3 td){
        System.out.println("Calling from method m1");
    }

    void m2(){
        m1(this);
    }

    public static void main(String[] args) {
        ThisDemo3 td = new ThisDemo3();
        td.m2();
    }

}
