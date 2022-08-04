import java.util.Scanner;

public class carHomework7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int yearOfModel = 0;
		String make = "";
		int speedOfCar = 0;

		final int MAX_Gallons = 15;
		
		Car volvo = new Car(yearOfModel, make);

		System.out.println("Enter the year of the car model: ");
		yearOfModel = in.nextInt();
		System.out.println("Enter the make of the car: ");
		make = in.next();
				
				
		Car.FuelGauge carFuel = new Car.FuelGauge();
		Car.FuelGauge.Odometer carOdometer = new Car.FuelGauge.Odometer(0, carFuel);

		for (int i = 0; i < MAX_Gallons; i++) {
			carFuel.addFuel(); //adding fuel to the car
		}
		System.out.println("Year of the car model: " + yearOfModel);
		System.out.println("Name of the car make: " + make+ "\n");
		
		for (int i = 1; i <= 5; i++){
		Car.accelerate();
		
		}
	System.out.println("Car's current speed: " + Car.getSpeed() +" miles\n");
		
		
		
		while (carFuel.getGallons() > 0) {
			
			
			
			carOdometer.increaseMileage(); //increasing mileage as user drives car

			System.out.println("Car mileage: " + carOdometer.getMileage()); // prints out mileage as car drives

			System.out.println("Amount of fuel: " + carFuel.getGallons() + " gallons\n"); //prints out the fuel amount as car drives
			for (int i = 1; i <= 5; i++){
			Car.brake();
			}
		
			
		}	
		System.out.println("Car's current speed: " + Car.getSpeed() +" miles\n");
		in.close();
	}

}
