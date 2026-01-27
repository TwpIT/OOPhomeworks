import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter interest rate: ");
        double interestRate = scanner.nextDouble();

        double interestAmount = balance * (interestRate / 100);
        double newBalance = balance + interestAmount;

        System.out.println("Initial Balance: " + balance);
        System.out.println("Interest added: " + interestAmount);
        System.out.println("New Balance: " + newBalance);

        scanner.close();
    }
}
