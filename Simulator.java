public class Simulator {
    public static void main(String[] args) {
        ParkingLot lot1 = new ParkingLot(6);
        Car car1 = new Car("1", lot1);
        Car car2 = new Car("2", lot1);

        car1.start();
        car2.start();
    }
}
