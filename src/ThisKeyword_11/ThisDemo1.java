package ThisKeyword_11;

public class ThisDemo1 {

    void display(){
        System.out.println("Hello!!!");
    }
    void show(){
        this.display();
    }

    public static void main(String[] args) {
        ThisDemo1 d1 = new ThisDemo1();
        d1.show();
    }
}
