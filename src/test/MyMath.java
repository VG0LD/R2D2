package test;
import java.util.Scanner;

public class MyMath {

    private static final double Pi = 3.14;
//    private static int num = new Scanner(System.in).nextInt();
//    private static int num2 = new Scanner(System.in).nextInt();

    public static int square (int number) {
        return number * number;
    }

    public static double length  (double radius) {
        return 2 * Pi * radius;
    }

    public static double area (double radius) {
        return Pi * radius * radius;
    }

//    public static int sum () {
//        return num + num2;
//    }

    public static int sum2 (int... numbers) {
        int sum = 0;
        for (int i: numbers) {
            sum += i;
        }
        return sum;
    }
}
