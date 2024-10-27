package Interface;

public class Cooker extends Employee implements CanCook{

    @Override
    public void cook() {
        System.out.println(getName() + " is cooking");
    }

    public Cooker(String name) {
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
