package excerise.jwilson.com;

/**
 * Created by jwilson on 05/04/2017.
 */
public class Vehicle {

    private int changingGears;
    private int handSteering;
    private String manufacturer;


    public Vehicle(int changingGears, int handSteering, String manufacturer) {
        this.changingGears = changingGears;
        this.handSteering = handSteering;
        this.manufacturer = manufacturer;
    }

    public void moving(int speed) {
        System.out.println("Vehicle.move() called - with speed of " + speed);
    }

    public int getChangingGears() {
        return changingGears;
    }

    public int getHandSteering() {
        return handSteering;
    }

    public String getManufacturer() {
        return manufacturer;
    }


}
