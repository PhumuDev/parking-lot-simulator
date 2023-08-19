import java.util.Random;

public class Car extends Thread {
    int carNumber;
    ParkingLot lot;
    boolean waited = false; // if car had to wait for parking

    public Car(int carNumber, ParkingLot lot) {
        this.carNumber = carNumber;
        this.lot = lot;
    }

    @Override
    public void run() {
        Random random = new Random();

        // Park for a random time and leave
        Park();
        try {
            // Sleep for 10 seconds (10000 milliseconds)
            Thread.sleep(random.nextInt(50000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Leave();
    }

    public void Park() {
        // check if there is a free space
        if ((lot.getSpaces()) == 0) {
            lot.Wait();
            waited = true;
            System.out.println("Car " + carNumber + " waiting" + "\n" + lot.toString());
        }

        while ((lot.getSpaces()) == 0) {
            continue;
        }

        if ((lot.getSpaces()) != 0) {

            if (waited) {
                lot.EndWait();
            }

            lot.Park();
            System.out.println("Car " + carNumber + " has parked" + "\n" + lot.toString());

        }

    }

    public void Leave() {
        lot.Leave();
        System.out.println("Car " + carNumber + " has left" + "\n" + lot.toString());
    }
}
