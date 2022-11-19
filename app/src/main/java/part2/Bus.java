package part2;

public class Bus extends Machine {
    public Bus(String name, int weight, int maxSpeed, int passangersCount) {
        super(name, weight, maxSpeed, passangersCount);
    }

    public void managePassangers() {
        System.out.println("Bus has: " + passangersCount + " passangers onboard.");
    }
}