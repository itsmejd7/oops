package f;

import java.util.ArrayList;
import java.util.Scanner;

public class StringOperations {
    private static int count = 0;

    public static void checkPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome");
            count++;
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }

    public static void handleStringOperations() {
        int m;
        String str;
        ArrayList<String> words = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of strings:");
        m = in.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.println("Enter string:");
            str = in.next();
            words.add(str);
        }

        count = 0;
        for (String word : words) {
            checkPalindrome(word);
        }

        System.out.println("The total number of palindrome strings: " + count);
        System.out.println("The total number of non-palindrome strings: " + (words.size() - count));
    }
}
