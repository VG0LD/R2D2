package Others;

public class Dog {
    String name;
    String breed;
    int speed;

    void run () {
        int i = 0;
        while (i < speed) {
            if (i == speed - 1) {
                System.out.println("Run!");
                break;
            }
            System.out.print("Run, ");
            i++;
        }
    }
    String info () {
        return name + " " + breed + " " + speed;
    }
}
