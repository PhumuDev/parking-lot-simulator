import java.util.Random;

public class Car extends Thread {
    String carNumber;
    ParkingLot lot;

    public Car(String carNumber, ParkingLot lot) {
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
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Leave();
    }

    public void Park() {
        // check if there is a free space
        if ((lot.getSpaces()) == 0) {
            System.out.println("Car " + carNumber + " waiting");
        }

        try {
            while ((lot.getSpaces()) == 0) {
                wait();
            }

            if ((lot.getSpaces()) != 0) {
                lot.Park();
                System.out.println("Car " + carNumber + " has parked");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void Leave() {
        lot.Leave();
        System.out.println("Car " + carNumber + " has left");
    }
}
