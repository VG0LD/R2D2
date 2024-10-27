package Interface;

public class Dogs extends Animals implements CanRun{
    @Override
    public void eat() {
        System.out.println("Bones");
    }
    public void run () {
        System.out.println("Dog is running");
    }
}
