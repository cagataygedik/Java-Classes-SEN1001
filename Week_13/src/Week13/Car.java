package Week13;

public class Car {
	
	//instance variables
	private String color;
	private String brand;
	private int numberOfDoors;
	private String size;
	private int speed;
	
	
	//constructor
	public Car() {
		//default constructor
	}
	
	public Car(String brand) {
		this.brand = brand;
	}
	
	public Car(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}
	
	public Car(String color, String brand, int numberOfDoors, String size, int speed) {
		this.color = color;
		this.brand = brand;
		this.numberOfDoors = numberOfDoors;
		this.size = size;
		this.speed = speed;
	}
	
	

	public Car(int numberOfDoors, String size, int speed) {
		this.numberOfDoors = numberOfDoors;
		this.size = size;
		this.speed = speed;
	}

	//methods
	
	//Set a new value to color variable
	public void setColor(String c) {
		color = c;
	}
	
	//Return the value of color back
	public String getColor() {
		return color;
	}
	
	public void setSpeed(int s) {
		if(s < 0) {
			speed = 0;
			
		} else if(s > 220) {
			speed = 220;
			
		} else {
			speed = s;
		}
	}
	
	public int getSpeed() {
		return speed;
	}
 	
	public void stop() {
		speed=0;
		}
		
	public void goFaster() {
		speed+=20;
		}
	
	public void goSlower() {
		speed-=20;
		
		if(speed<0)
			
		speed=0;
		}
	
	
	//read-only methods
	public String getBrand() {
		return brand;
	}

		
	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public String getSize() {
		return size;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "current speed: "+speed;
		
	}
}
