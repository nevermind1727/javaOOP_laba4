package part1;

public class Car extends Vehicle {

    @Override
    public void move(int id) {
        System.out.println("Car with id: " + id + " has been moved.");
    }
}