package excerise.jwilson.com;

/**
 * Created by jwilson on 05/04/2017.
 */
public class Car extends Vehicle{

    private int numberOfWheels;
    private int numberOfDoors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int numberOfWheels, int numberOfDoors, int gears, boolean isManual) {
        super(name, size);
        this.numberOfWheels = numberOfWheels;
        this.numberOfDoors = numberOfDoors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = currentGear;
    }

    public void changeGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear: Current gear is " + this.currentGear);
    }

    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity(): Velocity is " + speed + "\n" + "direction " + direction);
        move(speed, direction);
    }


}
