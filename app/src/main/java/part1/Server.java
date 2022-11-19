package part1;

public class Server {
  private int[] countVehicles;
  private int commonCountVehicles;
  private int limitVehicle;
  private Vehicle[] vehicles;

  public Server(int size) {
      countVehicles = new int[size];
      limitVehicle = size;
      vehicles = new Vehicle[limitVehicle];
  }

  public int getLimitVehicle() {
      return limitVehicle;
  }

  public int getCommonCountVehicle() {
      return commonCountVehicles;
  }

  public void addTransport(int numberVehicles, Vehicle vehicle) {
    System.out.println("Vehicle N" + getCommonCountVehicle());
    countVehicles[numberVehicles]++;
    commonCountVehicles ++;
    vehicles [numberVehicles] = vehicle;
    vehicle.move(countVehicles[numberVehicles]);
  }
}