package f;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Shape shape; // Base class reference

        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1. Triangle");
        System.out.println("2. Rectangle");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                shape = new Triangle(); // Dynamic binding
                System.out.println("Enter the base and height of the triangle:");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                shape.input(base, height);
                shape.compute_area();
            }
            case 2 -> {
                shape = new Rectangle(); // Dynamic binding
                System.out.println("Enter the length and breadth of the rectangle:");
                double length = sc.nextDouble();
                double breadth = sc.nextDouble();
                shape.input(length, breadth);
                shape.compute_area();
            }
            default -> System.out.println("Invalid choice!");
        }
    }
}
