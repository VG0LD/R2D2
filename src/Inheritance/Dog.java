package Inheritance;

public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.print("Dog");
        super.makeSound();
        System.out.println("gav gav");
    }
}
