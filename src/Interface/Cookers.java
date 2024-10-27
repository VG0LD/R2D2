package Interface;

public class Cookers implements CookAble{
    @Override
    public void cook() {
        System.out.println("Cooking");
    }
}
