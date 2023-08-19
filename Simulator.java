import java.util.Random;

public class Simulator {
    public static void main(String[] args) {
        ParkingLot lot1 = new ParkingLot(6);
        Random random = new Random();
        int i = 0;
        while (true) {
            i += 1;

            // wait before creating new car
            try {
                // Sleep for 10 seconds (10000 milliseconds)
                Thread.sleep(random.nextInt(7000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Car car1 = new Car(i, lot1);
            car1.start();
        }
    }
}
