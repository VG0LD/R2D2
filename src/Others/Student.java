package Others;

public class Student {
    private String name;
    private int age;
    private double averageGrade;

    public Student(String name, int age, double averageGrade) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    public void introduce () {
        System.out.println("Name: " + name + "\nAge: " + age + "\nAverage grade: " + averageGrade);
    }

    public double increaseAverageGrade(double amount) {
        return averageGrade += amount;
    }

    public double getAverageGrade() {
        return averageGrade;
    }
}

