package f;

public class Main {
    public static void main(String[] args) {
        // Creating the CarFactory object
        CarFactory carFactory = new CarFactory();

        // Asking the factory to create different types of cars
        Car myCar1 = carFactory.createCar("Hatchback");
        myCar1.showCarType();  // This should print: "This is a Hatchback car."

        Car myCar2 = carFactory.createCar("Sedan");
        myCar2.showCarType();  // This should print: "This is a Sedan car."

        Car myCar3 = carFactory.createCar("SUV");
        myCar3.showCarType();  // This should print: "This is an SUV car."
    }
}
