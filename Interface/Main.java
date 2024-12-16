package f;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a vehicle:");
        System.out.println("1. Bicycle");
        System.out.println("2. Bike");
        System.out.println("3. Car");
        int choice = sc.nextInt();

        Vehicle vehicle = null; // Reference for interface

        // Instantiate the selected vehicle
        switch (choice) {
            case 1 -> vehicle = new Bicycle();
            case 2 -> vehicle = new Bike();
            case 3 -> vehicle = new Car();
            default -> {
                System.out.println("Invalid choice!");
                System.exit(0);
            }
        }

        // Perform operations on the vehicle
        System.out.println("Performing operations on the selected vehicle...");
        vehicle.changeGear(2);  // Change gear
        vehicle.speedUp(30);   // Increase speed
        vehicle.applyBrakes(10); // Apply brakes
    }
}
