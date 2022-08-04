
public class Car {
	private int yearModel;
	private String make;
	private static int speed;

	final static int MAX_Gallons = 15; // changeable constant for max gallons

	public final static int maxMileage = 999999; // constant for max mileage
	
	final static int milesPerGallon = 24; // constant for miles per gallon

	Car(int model, String make) {

		Car.speed = 0;
		this.yearModel = model;
		this.make = make;

	}

	public static void setSpeed(int speed) {
		Car.speed = speed;

	}

	public static int getSpeed() {
		return Car.speed;

	}

	public String getMake() {

		return this.make;

	}

	public int getyearModel() {

		return this.yearModel;

	}
// if the car's speed is not equal to its max it will increase by 5
	public static void accelerate() {
		int maxSpeed = 105;
		if (speed != maxSpeed) {
			speed = speed + 5;
		}

	}
// if the car's speed isn't equal to zero, it's speed will decrease by 5
	public static void brake() {
		 if (speed != 0) {
			 speed = speed - 5;
		 }
		
		
	}

	static class FuelGauge {

		private static int gallons;
// constructor with no argument that sets fuel amount to 0; 
		public FuelGauge() {
			gallons = 0;
		}
// constructor that makes fuel equal to the agrument, if the argument is above 15 then the amount of fuel will be set to 15; 
		FuelGauge(int gallons) {
		//
			if (gallons <= MAX_Gallons) {
				Car.FuelGauge.gallons = gallons;
			} else {

				gallons = 15;

			}

		}
// getters method that gets the current amount of fuel. 
		int getGallons() {
			return gallons;
		}

// add fuels to car if tank is less than 15 gallons full
	public void addFuel() {

		if (gallons < MAX_Gallons) {
			gallons++;

		}

	}

	// burns fuel if the fuel tank is not empty
	public static void loseFuel() {
		if (gallons > 0) {
			gallons--;

		}
	}

	static class Odometer {

		private int mileage;
		private FuelGauge fuelGauge;
		private int startMileage;

		public Odometer(int mileage, FuelGauge fuel) {
			this.mileage = mileage;
			this.fuelGauge = fuel; // FuelGauge object
			this.startMileage = mileage; //Initial mileage on car
		}

		int getMileage() {
			return this.mileage;
		}
// increases mileage if the mileage is less than 999,999. if the car's mileage is 999,999, it resets to zero.
		public void increaseMileage() {
			// TODO Auto-generated method stub
			
			if (mileage < maxMileage) {
				mileage++;
			if (mileage == maxMileage) {
						mileage = 0;
					}

				}

			int mileageUsed = startMileage - mileage;
			if (mileageUsed % milesPerGallon == 0) {
				FuelGauge.loseFuel();
			}

		}

		}
	}

}