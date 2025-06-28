package Inheritance_3;

public class WildAnimal {
    void jungle() {
        System.out.println("Wild animals live in the jungle!");
    }
}

class Lion extends WildAnimal {
    void roar() {
        System.out.println("Lion roars");
    }
}

class Deer extends WildAnimal {
    void run() {
        System.out.println("Deer runs in the jungle");
    }

    public static void main(String[] args) {

        Lion l1 = new Lion();
        l1.jungle();
        l1.roar();

        System.out.println("------------------------------------------");

        Deer d1 = new Deer();
        d1.jungle();
        d1.run();
    }
}