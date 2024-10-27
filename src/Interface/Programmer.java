package Interface;

public class Programmer extends Employee implements CanProgram{

    @Override
    public void writeCode() {
        System.out.println(getName() + " is programming");
    }

    public Programmer(String name) {
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
