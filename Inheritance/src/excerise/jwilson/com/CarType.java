package excerise.jwilson.com;

/**
 * Created by jwilson on 05/04/2017.
 */
public class CarType extends Car{
    private int roadServicemonths;


    public CarType(int roadService) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServicemonths = roadServicemonths;
    }
    //  unique to the outlander as it is an automatic car
    public void accelerate(int rate){

        int newVelocity = getCurrentVelocity() + rate;

        if(newVelocity == 0){
            stop();
            changeGear(1);
        }else if(newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        }else if (newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        }else if (newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        }else if (newVelocity > 30 && newVelocity <=40){
            changeGear(4);
        }else{
            changeGear(5);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }

    }
}
