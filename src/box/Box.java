package box;

public class Box {
    private double width;
    private double height;
    private double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box (double size) {
        width = size;
        height = size;
        length = size;
    }

    public Box () {
        width = 0;
        height = 0;
        length = 0;
    }

    void showVolume () {
//        double volume = volume();
//        System.out.println(volume);
        System.out.println(volume());
    }
    double volume () {
        return width * height * length;
    }
    void setDimens (double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    int compare (Box box) {
        double thisVolume = volume();
        double boxVolume = box.volume();
        int result;
        if (thisVolume > boxVolume) {
            result = 1;
        } else if (thisVolume < boxVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }

    Box (Box box) {
        this.width = box.width;
        this.height = box.height;
        this.length = box.length;
    }

    Box createNew (int i) {
        return new Box(width + i, height + i, length + i);
    }

    Box (Box box1, Box box2) {
        this.width = box1.width + box2.width;
        this.height = box1.height + box2.height;
        this.length = box1.length + box2.length;
    }

    Box increase (int i) {
        return new Box(width * i, height * i, length * i);
    }

    public void showInfo () {
        System.out.println("Width: " + width );
        System.out.println("Height: " + height);
        System.out.println("Length: " + length);
    }

}
