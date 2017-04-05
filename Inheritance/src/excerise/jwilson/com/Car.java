package excerise.jwilson.com;

/**
 * Created by jwilson on 05/04/2017.
 */
public class Car extends Vehicle{

    private int numberOfWheels;
    private int numberOfDoors;
    private String name;
    private int numberOfMiles;

    public Car(int changingGears, int handSteering, String manufacturer, int numberOfWheels, int numberOfDoors, String name, int numberOfMiles) {
        super(changingGears, handSteering, manufacturer);
        this.numberOfWheels = numberOfWheels;
        this.numberOfDoors = numberOfDoors;
        this.name = name;
        this.numberOfMiles = numberOfMiles;
    }



}
