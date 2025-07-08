package ThisKeyword_11;

public class ThisDemo {
    int i ;

    void setI (int i){
        this.i = i;
    }
    void getI(){
        System.out.println(i);
    }

    public static void main(String[] args) {
        ThisDemo t = new ThisDemo();
        t.setI(125);
        t.getI();
    }
}
