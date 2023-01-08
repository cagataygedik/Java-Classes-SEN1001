package Week12;

public class Car {
	
	//instance variables
	String color;
	String brand;
	int numberOfDoors;
	String size;
	int speed;
		
	//methods
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "current speed: "+speed;
		
	}
}
