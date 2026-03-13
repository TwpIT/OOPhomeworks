package Practice2;
import java.util.Scanner;

public class Student {
    private String name;
    private String id;
    private int yearOfStudy;

    public Student(String name, String id) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name is required.");
        }
        if (id.isEmpty()) {
            throw new IllegalArgumentException("Id must be present.");
        }
        this.name = name;

        yearOfStudy = 1;
    }

    public String getName() { return name; }
    public String getId() { return id; }
    public int getYearOfStudy() { return yearOfStudy; }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student id: ");
        String id = scanner.nextLine();

        Student s = new Student(name, id);

        System.out.println("Student created:");
        System.out.println("Name: " + s.getName());
        System.out.println("Id: " + s.getId());
        System.out.println("Year of study: " + s.getYearOfStudy());

        System.out.println("Incrementing year of study...");
        s.yearOfStudy++;
        System.out.println("Year of study now: " + s.getYearOfStudy());

        scanner.close();
    }
}