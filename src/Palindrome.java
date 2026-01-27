import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.next();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        if (input.equals(reversed)) {
            System.out.println(input + " is Palindrome.");
        }
        else {
            System.out.println(input + " NOT Palindrome.");
        }
        scanner.close();
    }
}
