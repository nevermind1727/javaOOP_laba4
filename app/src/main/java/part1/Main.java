package part1;

public class Main {
    public static void main(String[] args) {
      Server server = new Server(10);
      for (int i = 0; i < server.getLimitVehicle(); i++) {
          Vehicle vehicle;
          int ran = (int) (1 + Math.random() * (4-1));
          switch(ran) {
              case 1: vehicle = new Car();
              break;
              case 2: vehicle = new Bicycle();
              break;
              case 3: vehicle = new Jumper();
              break;
              default:
                  vehicle = new RollerSkate();
                  break;
          }
        server.addTransport(ran, vehicle);
      }
    }
}
