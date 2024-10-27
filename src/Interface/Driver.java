package Interface;

public class Driver extends Employee implements CanDrive{

    @Override
    public void drive() {
        System.out.println(getName() + " is driving");
    }

    public Driver(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void voice() {
        super.voice();
    }
}
