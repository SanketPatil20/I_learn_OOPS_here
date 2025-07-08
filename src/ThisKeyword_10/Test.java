package ThisKeyword_10;

class thisKeyword {
    int i;

    void setValue(int i) {
        this.i = i;
        //here, this.i refers to the instance variable while later i refers to the local variable
    }

    void getValue() {
        System.out.println(i);
    }
}

public class Test {
    public static void main(String[] args) {
        thisKeyword k = new thisKeyword();
        k.setValue(50);
        k.getValue();
    }
}
