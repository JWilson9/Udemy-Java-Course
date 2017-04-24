/**
 * Created by james on 24/04/2017.
 */
public class Main {

	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case theCase = new Case("20a", "Dell", "240", dimensions);

		Monitor monitor = new Monitor("27-Inch new", "Acer", 27,
				new Resolution(2540, 1440));
		
		Motherboard motherboard = new Motherboard("AA-100", "Dell", 4, 5, "v2.44" );
		
		PC thePC = new PC(theCase, monitor, motherboard);
		thePC.getMonitor().drawPixelAt(150, 100, "blue");
		thePC.getMotherboard().loadProgram("Windows 1.0");
		
		thePC.getTheCase().pressPowerButton();

	}
}
