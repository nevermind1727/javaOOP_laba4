package part2;

public class Main {
    public static void main(String[] args) {
        Server server = new Server(10);
        for (int i = 0; i < server.getLimitVehicle(); i++) {
            Machine vehicle;
            int ran = (int) (1 + Math.random() * (4-1));
            switch(ran) {
                case 1: vehicle = new TractorWheeled("Tractor blue", 90, 350, 2, "wheeled");
                break;
                case 2: vehicle = new TractorCrawler("Tractor red", 70, 200, 1, "crawler");
                break;
                case 3: vehicle = new Bus("Bus green", 140, 400, 28);
                break;
                default:
                    vehicle = null;
                    break;
            }
          server.addTransport(ran, vehicle);
        }
    }
}
