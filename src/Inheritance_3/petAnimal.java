package Inheritance_3;

//The file name must exactly match the name of the public class it contains.

//In Java, you compile using the file name (which must match the public class name)
//but you run the program using the name of the class that contains the main() method.

public class petAnimal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class petDog extends petAnimal {

    public static void main(String[] args) {

        petDog dollar = new petDog();
        dollar.eat();

    }
}


