package f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class NumberOperations {
    private static int count = 0;

    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
            count++;
        } else {
            System.out.println(num + " is an odd number");
        }
    }

    public static void checkPrime(int num) {
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
            count++;
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    public static void handleIntegerOperations() {
        int element, n, choice;
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number:");
            element = in.nextInt();
            numbers.add(element);
        }

        System.out.println("1. Even or Odd");
        System.out.println("2. Prime or not");
        System.out.print("Choose: ");
        choice = in.nextInt();

        count = 0;
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            int num = itr.next();
            if (choice == 1) {
                checkEvenOdd(num);
            } else if (choice == 2) {
                checkPrime(num);
            } else {
                System.out.println("Invalid choice");
                return;
            }
        }

        if (choice == 1) {
            System.out.println("The total number of even numbers: " + count);
            System.out.println("The total number of odd numbers: " + (numbers.size() - count));
        } else if (choice == 2) {
            System.out.println("The total number of prime numbers: " + count);
            System.out.println("The total number of non-prime numbers: " + (numbers.size() - count));
        }
    }
}

