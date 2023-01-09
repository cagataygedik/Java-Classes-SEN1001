package Week13;


public class MainCar {

	public static void main(String[] args) {
		
		// 4 Concepts
		/*
		 * 1. Encapsulation(Data hiding)
		 * public - protected - private
		 * 1.1  Declare variables private
		 * 1.2 provide public methods to acces them - getter & setter
		 * 
		 * 
		 * 2. Inheritence
		 * 3. Abstraction
		 * 4. Polymorphism
		 */

		Car c1 = new Car();
		c1.setColor("blue");
		System.out.println(c1.getColor()); //prints blue
		
		c1.setSpeed(-200);
		System.out.println(c1.getSpeed()); //prints zero
		
		System.out.println("------------------------");
		
		Car c2 = new Car(); //constructor - initialize the object
		
		Car c3 = new Car("bmw");
		
		Car c4 = new Car("audi", "pink");
		//without "new" keyword you can not call the constructor.
		
		Car c5 = new Car("pink", "volvo", 4, "medium", 100 );
		System.out.println(c5.getBrand());
		
		
		
	}

}
