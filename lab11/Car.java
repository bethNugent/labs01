package lab11;

public class Car {
	public String model;
	public int speed;

	//Constructor for car class
public Car(String model, int speed) {
	this.model = model;
	this.speed = speed;
}

//Getters and setters
public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public int getSpeed() {
	return speed;
}

public void setSpeed(int speed) {
	this.speed = speed;
}

//Method to accelerate by 5 * seconds
public void accelerate(int seconds) {
	this.speed += 5 * seconds;
}

//Method to set speed to 60
public void getToSixty() {
	this.speed = 60;
}
	
}
