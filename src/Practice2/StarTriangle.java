package Practice2;
import java.util.Scanner;

public class StarTriangle {
    private int width;

    public StarTriangle(int width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be over 1.");
        }
        this.width = width;
    }

    public String toString() {
        String sb = "";
        for (int row = 1; row <= width; row++) {
            for (int i = 0; i < row; i++) {
                sb += ("[*]");
            }
            if (row < width) sb += ('\n');
        }

        return sb;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Width: ");
        int w = scanner.nextInt();

        StarTriangle small = new StarTriangle(w);

        System.out.println(small.toString());

        scanner.close();
    }

}
