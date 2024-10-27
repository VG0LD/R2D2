package Inheritance;

public class Kitten extends Animal{

    @Override
    public void makeSound() {
        System.out.print("Kitten");
        super.makeSound();
        System.out.println("meow meow");
    }
}
