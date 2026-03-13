package Problem5;

public class TestPetSystem {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");
        Person bob = new Student("Bob", 22, "Mathematics");

        Animal murka = new Cat("Murka", 5);
        Animal rex = new Dog("Rex", 3);
        Animal tweety = new Bird("Tweety", 2);

        john.assignPet(murka);
        bob.assignPet(rex);

        alice.assignPet(new Dog("Buddy", 4));

        alice.assignPet(tweety);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        registry.addPerson(bob);

        System.out.println(registry);

        System.out.println(" John goes on vacation, leaves pet with Alice ");
        john.leavePetWith(alice);
        System.out.println(registry);

        System.out.println(" Bob tries to leave dog with Alice (PhD student) ");
        bob.leavePetWith(alice);

        System.out.println("\n John returns and retrieves pet ");
        john.retrievePetFrom(alice);
        System.out.println(registry);

        System.out.println("People with pets:");
        for (Person p : registry.getPeopleWithPets()) {
            System.out.println("  " + p.getName());
        }

        System.out.println("People without pets:");
        for (Person p : registry.getPeopleWithoutPets()) {
            System.out.println("  " + p.getName());
        }
    }
}
