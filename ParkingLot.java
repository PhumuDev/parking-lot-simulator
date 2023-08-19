public class ParkingLot {

    private int Spaces;
    private int parkedCars = 0;

    // default constructor
    public ParkingLot() {
        Spaces = 6;
    }

    public ParkingLot(int Spaces) {
        this.Spaces = Spaces;
    }

    // Decrement number of spaces when new car is parked
    public synchronized void Park() {
        Spaces -= 1;
    }

    // Increment number of spaces when new car leaves
    public synchronized void Leave() {
        Spaces += 1;
    }

    public synchronized int getSpaces() {
        return Spaces;
    }
}