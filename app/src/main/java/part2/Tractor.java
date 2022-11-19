package part2;

public abstract class Tractor extends Machine {
  String type;
  public Tractor(String name, int weight, int maxSpeed, int passangersCount, String type) {
      super(name, weight, maxSpeed, passangersCount);
      this.type = type;
  }

  public void managePassangers() {
      System.out.println("Tractor has: " + passangersCount + " passangers onboard.");
  }
}