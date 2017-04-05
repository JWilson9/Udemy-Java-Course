/**
 * Created by jwilson on 02/04/2017.
 */
public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // base characteristics
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew(){
        System.out.println("Dog.chew() has just been called");
    }
    @Override
    public void eat() {
        chew();
        System.out.println("Dog.eat() method has just been called");
        super.eat();
    }

    public void walk(){
        System.out.println("dog.walk called");
        super.move(12);
    }

    public void run(){
        System.out.println("dog.run() called");
        move(30);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called with speed = " + speed);

    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
