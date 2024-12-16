package f;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Choose type:");
        System.out.println("1. String");
        System.out.println("2. Integer");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        switch (choice) {
            case 1 -> StringOperations.handleStringOperations();
            case 2 -> NumberOperations.handleIntegerOperations();
            default -> System.out.println("Invalid choice");
        }
    }
}
