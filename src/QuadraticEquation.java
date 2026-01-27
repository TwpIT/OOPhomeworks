import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        double d = (b * b) - (4 * a * c);

        if (d < 0) {
            System.out.println("No roots. D is negative");
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("One root: x = " + x);
        } else {
            double sqrtD = Math.sqrt(d);

            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (-b - sqrtD) / (2 * a);

            System.out.println("Two roots:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        scanner.close();
    }
}