public class ParkingLot {

    private int Limit;
    private int Spaces;
    private int parkedCars = 0;
    private int waitingCars = 0;

    // default constructor
    public ParkingLot() {
        Spaces = 6;
    }

    public ParkingLot(int limit) {
        this.Spaces = limit;
        this.Limit = limit;
    }

    // Decrement number of spaces when new car is parked
    public synchronized void Park() {
        Spaces -= 1;
        parkedCars += 1;
    }

    // Increment number of spaces wh en new car leaves
    public synchronized void Leave() {
        Spaces += 1;
        parkedCars -= 1;
    }

    public synchronized void Wait() {
        waitingCars += 1;
    }

    public synchronized void EndWait() {
        waitingCars -= 1;
    }

    public synchronized int getSpaces() {
        return Spaces;
    }

    public synchronized int getParkedCars() {
        return parkedCars;
    }

    public synchronized int getWaiting() {
        return waitingCars;
    }

    public String toString() {
        String line = "Capacity: " + getParkedCars() + "/" + Limit;
        line = line + "\nWaiting: " + getWaiting();
        line = line + "\n------------------------------------------";
        return line;
    }
}