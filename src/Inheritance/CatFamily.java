package Inheritance;

public class CatFamily {
    private int ears;
    private int legs;
    private boolean bigClaws;

//    public CatFamily() {
//        ears = 2;
//        legs = 4;
//        bigClaws = true;
//    }

    public CatFamily(int ears, int legs, boolean bigClaws) {
        this.ears = ears;
        this.legs = legs;
        this.bigClaws = bigClaws;
    }

    public void showInfo () {
        System.out.println("Ears: " + ears + "; legs: " + legs + "; BigClaws?: " + bigClaws);
    }

    public void setBigClaws(boolean bigClaws) {
        this.bigClaws = bigClaws;
    }

    public void eat() {
        System.out.print("Eating ");
    }
}
