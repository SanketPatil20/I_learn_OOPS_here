package Lec_1;

public class Animal {

    public void eat() {
        System.out.println("Animals are eating...");
    }

    public void run() {
        System.out.println("Animal says run run run...");
    }

    public static void main(String[] args) {
        System.out.println("Its main method calling");

// class Animal
        Animal dog = new Animal();
        dog.eat();
        dog.run();

// class Birds
        Birds sparrow = new Birds();
        sparrow.fly();

        Fishes goldfish = new Fishes();
        goldfish.color = "golden";
        goldfish.number = 10;

        System.out.println("Its " + goldfish.color + " and there are " + goldfish.number + " fishes");

//class Reptiles
        Reptiles crocodile = new Reptiles();

        crocodile.initObj("Red", 1);
        crocodile.display();
    }

}

// Only one public class is allowed per .java file in Java,
// and the filename must match the public class name (i.e., 'Animal').
// All other classes (Birds, Fishes, Reptiles) are package-private by default.

class Birds {

    void fly() {
        System.out.println("Birds are flying");
    }

}

// 1. Initialization of object using reference variables

class Fishes {
    String color;
    int number;
}

// 2. Initialization of object using methods

class Reptiles{
    String color;
    int age;

    void initObj(String c, int a){
        //initializing the object parameters into instance variables
        color = c;
        age = a;
    }

    void display(){
        System.out.println("Reptile has "+color +" color with age "+ age);
    }
}
