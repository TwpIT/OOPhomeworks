package Problem5;

import java.util.Objects;

public class PhDStudent extends Person {
    private String department;
    private String researchTopic;

    public PhDStudent(String name, int age, String department, String researchTopic) {
        super(name, age);
        this.department = department;
        this.researchTopic = researchTopic;
    }

    public String getDepartment() {
        return department;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog) {
            System.out.println("PhD students are too busy for dogs!");
            return;
        }
        super.assignPet(pet);
    }

    @Override
    public String getOccupation() {
        return "PhD Student - " + department + ", researching " + researchTopic;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        PhDStudent that = (PhDStudent) o;
        return Objects.equals(department, that.department) &&
               Objects.equals(researchTopic, that.researchTopic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department, researchTopic);
    }
}
