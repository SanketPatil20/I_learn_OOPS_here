package Inheritance_3;

class ZooAnimal {
    void sleep() {
        System.out.println("Animals in the zoo are sleeping.");
    }
}

class Tiger extends ZooAnimal {

    void eat() {
        System.out.println("Tigers in the zoo are eating.....");
    }
}

public class Cub extends Tiger {
    void roar() {
        System.out.println("Tigre cub roars");
    }

    public static void main(String[] args) {

        ZooAnimal elephant = new ZooAnimal();
        elephant.sleep();

        System.out.println("--------------------------------");

        Tiger king = new Tiger();
        king.sleep();
        king.eat();

        System.out.println("--------------------------------");

        Cub simba = new Cub();
        simba.sleep();
        simba.eat();
        simba.roar();

    }


}
