package Others;

public class React {
    double length;
    double width;

    void set (double length, double width) {
        this.length = length;
        this.width = width;
    }
    double perimeter () {
        return (length + width) * 2;
    }
    double S () {
        return length * width;
    }
}
