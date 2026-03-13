package Problem1;

import java.util.HashSet;

public class TestVehicle {
    public static void main(String[] args) {
        HashSet<Vehicle> vehicles = new HashSet<>();

        Vehicle v1 = new Vehicle("Toyota", 2020);
        Vehicle v2 = new Vehicle("Toyota", 2020);
        Vehicle v3 = new Vehicle("Honda", 2019);

        vehicles.add(v1);
        vehicles.add(v2);
        vehicles.add(v3);

        System.out.println("Vehicles in set (should be 2):");
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
        System.out.println("Size: " + vehicles.size());

        System.out.println();

        HashSet<Car> cars = new HashSet<>();

        Car c1 = new Car("Toyota", 2020, "Camry");
        Car c2 = new Car("Toyota", 2020, "Camry");
        Car c3 = new Car("Toyota", 2020, "Corolla");

        cars.add(c1);
        cars.add(c2);
        cars.add(c3);

        System.out.println("Cars in set (should be 2):");
        for (Car c : cars) {
            System.out.println(c);
        }
        System.out.println("Size: " + cars.size());
    }
}
