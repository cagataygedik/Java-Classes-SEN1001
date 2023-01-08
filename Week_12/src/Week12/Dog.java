package Week12;

public class Dog {

	//states -  instance variables
	String breed;
	String color;
	String size;
	int age;
	String name;
	int numberOfLegs=4;
		
	//methods
	
	/*
	 * These methods don't have static keyword because they're going to call with an object.
	 * Example: d1.sleep();
	 */
	
	public void sleep() {
		System.out.println(name +" is sleeping zzZZZzzZ");
	}
	
	public void eat() {
		System.out.println(name + " is eating");
	}
	
	public void run() {
		System.out.println(name + " is running");
	}
	
	public void sit() {
		System.out.println(name + " sitting");
	}
	
	//We override the toString method return type.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name:" + name +"\nBreed:"+ breed +"\nSize:"+size+"\nColor:"+color+ "\nAge:"+age;
	}

}
