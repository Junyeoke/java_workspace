package ch08;

public class CarMainTest {

	public static void main(String[] args) {
		
		Car aiCar = new AICar();
		aiCar.run();
		
		System.out.println("====================");
		
		Car mauncalCar = new ManualCar();
		mauncalCar.run();
		
	} // end of main

} // end of class
