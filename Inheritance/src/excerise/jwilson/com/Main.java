package excerise.jwilson.com;

/**
 * Created by jwilson on 05/04/2017.
 */
public class Main {

    public static void main(String[] args){
        // road service every 36 months
        CarType outlander = new CarType(36);
        outlander.steer(135);
        outlander.accelerate(15);
        outlander.steer(45);
        outlander.accelerate(20);
    }
}
