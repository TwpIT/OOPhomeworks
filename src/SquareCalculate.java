import java.util.Scanner;

public class SquareCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Side of the square: ");
        double a = scanner.nextDouble();

        double area = a * a;
        double perimeter = 4 * a;
        double diagonal = a * Math.sqrt(2);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.printf("Diagonal length: %.2f\n", diagonal);

        scanner.close();
    }
}
