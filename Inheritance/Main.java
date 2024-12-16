package f;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Mobile Number: ");
        long mobile = sc.nextLong();

        System.out.print("Enter Basic Pay: ");
        double basicPay = sc.nextDouble();

        System.out.println("\nChoose Employee Role:");
        System.out.println("1. Programmer");
        System.out.println("2. Team Lead");
        System.out.println("3. Assistant Project Manager");
        System.out.println("4. Project Manager");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                Programmer programmer = new Programmer(name, id, address, email, mobile, basicPay);
                programmer.generatePaySlip();
            }
            case 2 -> {
                TeamLead teamLead = new TeamLead(name, id, address, email, mobile, basicPay);
                teamLead.generatePaySlip();
            }
            case 3 -> {
                AssistantProjectManager apm = new AssistantProjectManager(name, id, address, email, mobile, basicPay);
                apm.generatePaySlip();
            }
            case 4 -> {
                ProjectManager pm = new ProjectManager(name, id, address, email, mobile, basicPay);
                pm.generatePaySlip();
            }
            default -> System.out.println("Invalid choice!");
        }
    }
}
