package part2;

public abstract class Machine implements Run {
    static String name;
    int weight;
    int maxSpeed;
    int passangersCount;

    public Machine(String name, int weight, int maxSpeed, int passangersCount) {
      this.name = name;
      this.weight = weight;
      this.maxSpeed = maxSpeed;
      this.passangersCount = passangersCount;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    abstract void managePassangers();

    public void move(int id) {
        System.out.println("Machine with name: " + name + " " + id + " has been moved.");
    }
}