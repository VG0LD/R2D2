package Others;

public class Worker {
    String name;
    String position;
    double salary;

    public Worker(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    String info (int i) {
        return "Worker - " + name + " on a position " + position + " has total salary " + (i * salary) + "$ for " + i + " months";
    }
}
