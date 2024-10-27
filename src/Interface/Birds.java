package Interface;

public class Birds extends Animals implements CanRun, Flyable{
    @Override
    public void eat() {
        System.out.println("Bird-meal");
    }

    @Override
    public void run() {
        System.out.println("Bird is running");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
