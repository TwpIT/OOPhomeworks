package Problem5;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;
    private Animal tempPetFromOther;
    private Person petOwner;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.pet = null;
        this.tempPetFromOther = null;
        this.petOwner = null;
    }

    public void assignPet(Animal pet) {
        this.pet = pet;
    }

    public void removePet() {
        this.pet = null;
    }

    public boolean hasPet() {
        return pet != null || tempPetFromOther != null;
    }

    public Animal getPet() {
        return pet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String getOccupation();

    public void leavePetWith(Person caretaker) {
        if (pet == null) {
            System.out.println(name + " doesn't have a pet to leave.");
            return;
        }
        if (caretaker instanceof PhDStudent && pet instanceof Dog) {
            System.out.println("PhD students can't take care of dogs!");
            return;
        }
        caretaker.tempPetFromOther = this.pet;
        caretaker.petOwner = this;
        this.pet = null;
        System.out.println(name + " left their pet with " + caretaker.getName());
    }

    public void retrievePetFrom(Person caretaker) {
        if (caretaker.tempPetFromOther == null) {
            System.out.println(caretaker.getName() + " doesn't have a temp pet.");
            return;
        }
        if (caretaker.petOwner != this) {
            System.out.println("That pet doesn't belong to " + name);
            return;
        }
        this.pet = caretaker.tempPetFromOther;
        caretaker.tempPetFromOther = null;
        caretaker.petOwner = null;
        System.out.println(name + " retrieved their pet from " + caretaker.getName());
    }

    @Override
    public String toString() {
        String result = name + " (age " + age + ", " + getOccupation() + ")";
        if (pet != null) {
            result += " owns " + pet;
        }
        if (tempPetFromOther != null) {
            result += " taking care of " + tempPetFromOther + " for " + petOwner.getName();
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
