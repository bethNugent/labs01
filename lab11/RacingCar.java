package lab11;

public class RacingCar extends Car {
	//fields
	public String driver;
	public double turboFactor;
	
	//constructor
	public RacingCar(String model, int speed, String driver, double turboFactor) {
		super(model, speed);
		this.driver = driver;
		this.turboFactor = turboFactor;
	}
	
	//getters and setters
	public String getDriver() {
		return driver;
	}
	
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public double getTurboFactor() {
		return turboFactor;
	}

	public void setTurboFactor(double turboFactor) {
		this.turboFactor = turboFactor;
	}
	
	//base class method accelerate override
//	@Override
//	public void accelerate() {
//		
//	}
	
}
