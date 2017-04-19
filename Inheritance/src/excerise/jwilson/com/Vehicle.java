package excerise.jwilson.com;

/**
 * Created by jwilson on 05/04/2017.
 */
public class Vehicle {

    private String name;
    private String size;

    private int currentDirection;
    private int currentVelocity;


    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;

    }

    public void steer(int direction){
        this.currentDirection = direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + "degrees");
    }

    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Mving at: " +  currentVelocity + "\n" + "in the direction " + currentDirection);

    }

    public void stop(){
        this.currentVelocity = 0;
    }

    public String getName(){
        return name;
    }

    public String getSize(){
        return size;
    }

    public int getCurrentDirection(){
        return currentDirection;
    }

    public int getCurrentVelocity(){
        return currentVelocity;
    }







}
