package StaticKeyword_15;

public class Counter {

    static int count = 0;  //Counter will increase with every new object created

    Counter(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

    }
}
