package Interface;

public class Cats extends Animals implements CanRun{
    @Override
    public void eat() {
        System.out.println("Viskas");
    }

    public void run () {
        System.out.println("Cat is running");
    }
}
