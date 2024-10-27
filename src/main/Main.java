package main;
import Interface.*;
import Others.Dog;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
//        String month = "A";
//        if (month == "J" || month == "F" || month == "D") {s
//            System.out.println("It is winter");
//        } else if (month == "Mar" || month == "Ap" || month == "May")
//            {
//                System.out.println("It is Spring");
//        } else if (month == "Ju" || month == "Jul" || month == "A")
//        {
//            System.out.println("It is Summer");
//        } else if (month == "S" || month == "O" || month == "N")
//        {
//            System.out.println("It is Autumn");
//        } else {
//            System.out.println("month does not exist");
//        }

//        int month = 9;
//            switch (month) {
//                case 1:
//                case 2:
//                case 12:
//                    System.out.println("It is winter");
//                    break;
//                case 3:
//                case 4:
//                case 5:
//                    System.out.println("It is Spring");
//                    break;
//                case 6:
//                case 7:
//                case 8:
//                    System.out.println("It is Summer");
//                    break;
//                case 9:
//                case 10:
//                case 11:
//                    System.out.println("It is Autumn");
//                    break;
//            }

//                Box myBox;
//                myBox = new Box();

//        Box myBox = new Box();
//        myBox.height = 10.2;
//        myBox.width = 11.3;
//        myBox.length = 15;
//        double volume = myBox.height * myBox.length * myBox.width;
//        System.out.println(volume);
//        Box box2 = new Box();
//        Box box3 = new Box();
//        box2.length = 5;
//        box2.height = 5;
//        box2.width = 5;
//        box3.height = 10;
//        box3.width = 10;
//        box3.length = 10;
//        double volume2 = box2.height * box2.length * box2.width;
//        double volume3 = box3.height * box3.length * box3.width;
//        System.out.println("Box1: " + volume + "\nBox2: " + volume2 + "\nBox3: " + volume3);

//        Human human1 = new Human();
//        Human human2 = new Human();
//        Human human3 = new Human();
//        Human human4 = new Human();
//        Human human5 = new Human();
//        human1.name = "Henry";
//        human2.name = "Ben";
//        human3.name = "Gal";
//        human4.name = "Chris";
//        human5.name = "Robert";
//        human1.age = 37;
//        human2.age = 45;
//        human3.age = 35;
//        human4.age = 40;
//        human5.age = 48;
//        human1.weight =  87.500;
//        human2.weight =  90.250;
//        human3.weight =  55.820;
//        human4.weight =  95.120;
//        human5.weight =  75.720;
//
////        int averageAge = (human1.age + human2.age + human3.age + human4.age + human5.age) / 5;
////        System.out.println(averageAge);
//
//        Human[] humanity = new Human[5];
//        humanity[0] = human1;
//        humanity[1] = human2;
//        humanity[2] = human3;
//        humanity[3] = human4;
//        humanity[4] = human5;
//
//        int sum = 0;
//        for (int i = 0; i < humanity.length; i++) {
//            sum = sum + humanity[i].age;
//            System.out.print("* ");
//            if (i == humanity.length -1) {
//                System.out.println();
//            }
//        }
//        System.out.println(sum/(double)humanity.length);

//        Box box1 = new Box();
//        Box box2 = new Box();
//        box1.height = 5;
//        box1.width = 5;
//        box1.length = 5;
//        box2.height = 10;
//        box2.width = 10;
//        box2.length = 10;
//        box1.showVolume();
//        box2.showVolume();
//        double volume1 =box1.volume();
//        double volume2 = box2.volume();
//        System.out.println(volume1 + " " + volume2);


//        Dog dog1 = new Dog();
//        Dog dog2 = new Dog();
//        dog1.name = "Brawny";
//        dog1.breed = "Dog";
//        dog1.speed = 5;
//        dog2.name = "Kelvin";
//        dog2.breed = "Hund";
//        dog2.speed = 10;
//        String info = dog1.info();
//        String info2 = dog2.info();
//        System.out.print(info + " ");
//        dog1.run();
//        System.out.print(info2 + " ");
//        dog2.run();

//        Test test = new Test();
//        int square = test.square(80);
//        System.out.println(square);
//        System.out.println(test.square(60));

//        Box box = new Box();
//        box.setDimens(15,15,15);
//        System.out.println(box.volume());
//        box.showVolume();

//        React rect = new React();
//        rect.set(5, 10);
//        System.out.println("Rect is equal to width: " + rect.width + " length: " + rect.length + " Perimetr: " +
//                rect.perimeter() + " S: " + rect.S());

//        Box box = new Box(10, 15,20);
//        System.out.println(box.volume());
//        Box box2 = new Box(30,30,30);
//        System.out.println(box2.volume());

//        Worker worker = new Worker("Adel", "Manager", 100);
//        System.out.println(worker.info(5));

//        Student student = new Student("Adel", 22, 1.0);
//        student.introduce();
//        student.increaseAverageGrade(2.5);
//        System.out.println(" New average score is " + student.getAverageGrade());

//        BankAccount bankAccount = new BankAccount("152312436798", 1500);
//        bankAccount.deposit(500);
//        bankAccount.withdraw(1000);
//        bankAccount.getAccountInfo();

//        Car car = new Car("Honda", "Hyndai", 2001, 25);
//        Car car2 = new Car("Mercedec", "Benz", 2005, 30);
//        car.displayInfo();
//        car2.displayInfo();

//        Book book = new Book("Harry Potter", "Herman Gesse");
//        Book book2 = new Book("Outsider", "Stiven King");
//        User user = new User("Zara");
//        User user2 = new User("Prada");
//
//        user.rentBook(book);
//        user2.rentBook(book);

//        Test test = new Test();
//        int result = test.multiple(5);
//        System.out.println(result);
//        System.out.println(test.multiple(5,5.5));
//        int res = Test.multiple(5);
//        System.out.println(res);

//        String man = Test.name("Black", "Adam");
//        man = man + Test.name(12436798);
//        System.out.println(man);

//        Box box = new Box(10);
//        Box box2 = new Box(15,20,25);
//        box.showVolume();
//        box2.showVolume();
//
//        Box box3 = new Box();
//        box3.showVolume();

//        Monster monster = new Monster(5,5,5);
//        monster.defineMonster();
//        monster.voice();
//        monster.voice(2);
//        monster.voice(5,"King");

//        Calculator  number = new Calculator();
//        System.out.println(number.add(1,2));

//        Box box = new Box(100);
//        Box box2 = new Box(15, 20, 25);
//        int result = box.compare(box2);

//        switch (result) {
//            case -1:
//                System.out.println("Our box is smaller");
//                break;
//            case 0:
//                System.out.println("Boxes are equal");
//                break;
//            case 1:
//                System.out.println("Our box is bigger");
//                break;
//        }

//        Box box1 = new Box(10);
//        Box box2 = box1.increase(10);
//        box1.showVolume();
//        box2.showVolume();
//        Box box2 = new Box(box1);
//        box1.setDimens(15, 15, 15);
//        box2.increase();
//        int result = box1.compare(box2);
//
//        switch (result) {
//            case -1:
//                System.out.println("Our box is smaller");
//                break;
//            case 0:
//                System.out.println("Boxes are equal");
//                break;
//            case 1:
//                System.out.println("Our box is bigger");
//                break;
//        }
//
//        Box box1 = new Box(10);
//        Box box2 = box1.createNew(20);
//        box2.showVolume();
//        Box box3 = new Box(box1, box2);
//        box3.showVolume();

//        Man man = new Man("Ivan", 27);
//        man.setAge(28);
//        man.showInfo();
//        System.out.println(man.getAge());
//        Box box = new Box();

//        int n = 1;
//        for (int i = 1; i <= 5; i++) {
//            n = n * i;
//        }
//        System.out.println(n);

//        int square = MyMath.square(20);
//        System.out.println(square);

//        double length = MyMath.length(10);
//        System.out.println(length);
//        double area = MyMath.area(10);
//        System.out.println(area);
//        length = MyMath.length(10);
//        System.out.println(length);

//        System.out.println(MyMath.sum());

//        int sum = MyMath.sum2(5,5,2,2);
//        System.out.println(sum);

//        Student student = new Student("Ivan", 34, 55.0);
//        Student student2 = new Student("John", 33, 60.5);
//        student.introduce();
//        student2.introduce();
//        student.increaseAverageGrade(2);
//        student2.increaseAverageGrade(3.5);
//        System.out.println(student.getAverageGrade() + "\n" + student2.getAverageGrade());

//        String[] employees = {"Neko", "Gera"};
//        String[] second = new String[employees.length + 1];
//        for (int i = 0; i < employees.length; i++) {
//            second[i] = employees[i];
//        }
//        second[second.length-1] = "Iron";
//        employees = second;
//        employees[1] = null;
//        String[] newNames = new String[employees.length-1];
//        for (int i = 0, j = 0; i < employees.length; i++) {
//            if (employees[i] != null) {
//                newNames[j] = employees[i];
//                j++;
//            }
//        }
//        employees = newNames;
//        for (String name: employees) {
//            System.out.println(name);
//        }

//        int[] x = new int[10];
//        int[] y = new int[10];
//        for (int i = 0, j = x.length - 1; i < x.length; i++, j--) {
//            x[i] = i;
//            y[i] = j;
//        }
//
//        for (int i: y) {
//            System.out.print(i + " ");
//        }

//        MyArrayList employees = new MyArrayList();
//        employees.add("Andrew");
//        employees.add("Tobey");
//        employees.add("Tom");
//        employees.add("Garfield");
//        employees.add("Maq");
//        employees.add("Holland");
//
//        employees.remove("Tobey");
//        employees.remove("Tom");
//        employees.remove(2);
//        employees.remove("Honey");
//
////        for (int i = 1; i < 100; i++) {
////            employees.add("employee " + i);
////        }
//
//        for (int i = 0; i < employees.getSize(); i++) {
//            System.out.println(employees.get(i));
//        }
//
//        System.out.println(employees.getSize());

//        ArrayList name = new ArrayList();
//        name.add("fill");
//        System.out.println(name.get(0));

//        int a = 5;
//        Integer b = 5;
//        byte c;
//        Byte g;
//        short q;
//        Short w;
//        long s;
//        Long d;
//        char f;
//        Character h;
//        float y;
//        Float u;
//        double z;
//        Double x;
//        boolean k;
//        Boolean l;

//        String s = "1000";
//        String x = "2000";
//        int a = Integer.parseInt(s);
//        int b = Integer.parseInt(x);
//        System.out.println(a + b);

//        String s = "true";
//        boolean bool = Boolean.parseBoolean(s);
//        System.out.println(bool);

//        String s = "It is Vainglory, he is programmer";
//        String name = s.substring(6, 15);
//        System.out.println(name);

//        String s = "It is John, he is 34 y.o., his height is 180.0 sm. Position is programmer";
//        String name = s.substring(6, 10);
//        String agePars = s.substring(18, 20);
//        String heightPars = s.substring(41, 46);
//        String position = s.substring(63, 73);
//
//        int age = Integer.parseInt(agePars);
//        double height = Double.parseDouble(heightPars);
//
//        Men employee = new Men(name, position, age, height);
//
//        System.out.println("Name: " + employee.getName() + "; Position: " + employee.getPosition() +
//                "; Age: " + employee.getAge() + "; Height: " + employee.getHeight());

//        ArrayList<String> employees = new ArrayList<>();
//        employees.add("John");
//        employees.add("Tobey");
//        employees.add("Andrew");
//        employees.add("Butcher");
//        employees.add("Star");
//
//        employees.remove(0);
//        for (int i = 0; i < employees.size(); i++) {
//            System.out.println(employees.get(i));
////        }
//        for (String name: employees) {
//            System.out.println(name);
//        }
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//        for (int i = 0; i < 1000; i++) {
//            numbers.add(i);
//        }
//        int sum = 0;
//        for (int nums: numbers) {
//            sum += nums;
//        }
//        System.out.println(sum);

//        ArrayList<Integer> collection1 = new ArrayList<>();
//        for (int i = 1; i <= 10; i++) {
//            collection1.add(i);
//        }
//
//        ArrayList<String> collection2 = new ArrayList<>();
//        collection2.add("John");
//        collection2.add("Tobey");
//        collection2.add("Andrew");
//        collection2.add("Tom");
//        collection2.add("Jerry");
//        collection2.add("Ronald");
//        collection2.add("Donald");
//        collection2.add("Brad");
//        collection2.add("Ben");
//        collection2.add("Steven");
//
//        ArrayList<String> collection3 = new ArrayList<>();
//        for (int i = 0; i < collection1.size(); i++) {
//            String s = collection1.get(i) + " " + collection2.get(i);
//            collection3.add(s);
//        }
//        for (String s: collection3) {
//            System.out.println(s);
//        }

//        Cat cat = new Cat();
//        Lion lion = new Lion();
////        lion.setBigClaws(false);
//        cat.showInfo();
//        lion.showInfo();
//        cat.eat();
//        lion.eat();

//        Box box = new Box(15);
//        BoxWeight boxWeight = new BoxWeight(10,20,30,15.5);
//        box.showInfo();
//        boxWeight.showInfo();

//        Dog dog = new Dog();
//        dog.makeSound();
//        Kitten kitten = new Kitten();
//        kitten.makeSound();

//        Scanner sc = new Scanner(System.in);
//        if () {
//
//        }

//        Rect rect = new Rect(5,10);
//        Triangle triangle = new Triangle(10);
//
//        System.out.println("Area of rect: " + rect.area() + "; Area of triangle: " + triangle.area());
//
//        ColorRect color = new ColorRect(5);
//        System.out.println(color.area());

//        Dogs dog = new Dogs();
//        Cats cat = new Cats();
//        Fish fish = new Fish();
//        Birds bird = new Birds();
//
//        ArrayList<Animals> animals = new ArrayList<>();
//        animals.add(dog);
//        animals.add(cat);
//        animals.add(fish);
//        animals.add(bird);
//
//        for (Animals animal : animals) {
//            animal.eat();
//        }
//        Dogs dog2 = new Dogs();
//        dog2.run();
////        Animals animal = dog2;
//
//        Dogs dogg1 = new Dogs();
//        Dogs dogg2 = new Dogs();
//        Dogs dogg3 = new Dogs();
//        Dogs dogg4 = new Dogs();
//        Dogs dogg5 = new Dogs();
//        Cats catt1 = new Cats();
//        Cats catt2 = new Cats();
//        Cats catt3 = new Cats();
//        Cats catt4 = new Cats();
//        Cats catt5 = new Cats();
//        Birds birds = new Birds();
//        dogg2.eat();
//
//        ArrayList<CanRun> animalss= new ArrayList<>();
//        animalss.add(dogg1);
//        animalss.add(dogg2);
//        animalss.add(catt1);
//        animalss.add(birds);
//
//        for (CanRun animal : animalss) {
//            animal.run();
//        }

//        Dogs dog = new Dogs();
//        CanRun canRun = dog;
//        dog = (Dogs) canRun;
//        dog.eat();
//
//        Flyable flyable = new Birds();
//        flyable.fly();

//        Programmer programmer = new Programmer("Nekreirypt");
//        Programmer programmer2 = new Programmer("Nekreirypt");
//        Programmer programmer3 = new Programmer("Nekreirypt");
//        Driver driver = new Driver("President");
//        Driver driver2 = new Driver("President");
//        Driver driver3 = new Driver("President");
//        Cooker cooker = new Cooker("Niko");
//        Cooker cooker2 = new Cooker("Niko");
//        Cooker cooker3 = new Cooker("Niko");
//
//        ArrayList<Employee> employees = new ArrayList<>();
//        employees.add(programmer);
//        employees.add(programmer2);
//        employees.add(programmer3);
//        employees.add(driver);
//        employees.add(driver2);
//        employees.add(driver3);
//        employees.add(cooker);
//        employees.add(cooker2);
//        employees.add(cooker3);
//
//        for (Employee employee: employees) {
//            System.out.println(employee.getName());
//        }
//
//        ArrayList<Programmer> programmers = new ArrayList<>();
//        programmers.add(programmer);
//        programmers.add(programmer2);
//        programmers.add(programmer3);
//        for (Programmer programmersW : programmers) {
//            programmersW.writeCode();
//        }
//
//        ArrayList<Driver> drivers = new ArrayList<>();
//        drivers.add(driver);
//        drivers.add(driver2);
//        drivers.add(driver3);
//        for (Driver driversW : drivers) {
//            driversW.drive();
//        }
//
//        ArrayList<Cooker> cookers = new ArrayList<>();
//        cookers.add(cooker);
//        cookers.add(cooker2);
//        cookers.add(cooker3);
//        for (Cooker cookersW : cookers) {
//            cookersW.cook();
//        }
//
//        Director director = new Director();
////        Cookers cookerss = new Cookers();
//        director.force(new CookAble() {
//            @Override
//            public void cook() {
//                System.out.println("Cookingg");
//            }
//        });

        Directors director = new Directors();

        //Первый способ анонимный класс, метод принимает 2 аргумента - первый counter, потом через запятую указываем число месяцев.
        director.force(new Counter() {
            @Override
            public String report(int countOfMonths) {
                return "Отчет за " + countOfMonths + " месяцев";
            }
        }, 12);

        //Второй способ
        MyCounter counter = new MyCounter();
        director.force(counter, 12);


    }
}
