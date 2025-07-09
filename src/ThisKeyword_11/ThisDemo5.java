package ThisKeyword_11;

public class ThisDemo5 {

    ThisDemo5 m1(){
        System.out.println("Returning current class instance");
        return this;
    }

    public static void main(String[] args) {
        ThisDemo5 t = new ThisDemo5();
        t.m1();
    }
}
