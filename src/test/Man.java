package test;

public class Man {
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo () {
        System.out.println("name " + name + "\nage " + age);
    }

    public void setAge (int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age should be more than zero");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
