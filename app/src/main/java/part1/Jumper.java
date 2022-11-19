package part1;

public class Jumper extends Vehicle {

    @Override
    public void move(int id) {
        System.out.println("Jumper with id: " + id + " has been moved.");
    }
}