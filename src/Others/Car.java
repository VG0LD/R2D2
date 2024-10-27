package Others;

public class Car {
    String brand;
    String model;
    int year;
    double fuelConsumption;

    public Car(String brand, String model, int year, double fuelConsumption) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelConsumption = fuelConsumption;
    }

    void displayInfo () {
        System.out.println("Brand " + brand + ", model " + model + ", year " + year + ", Fuel Consumption " + fuelConsumption);
    }

}
