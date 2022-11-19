package part1;

public class Bicycle extends Vehicle {

    @Override
    public void move(int id) {
        System.out.println("Bicycle with id: " + id + " has been moved.");
    }
}