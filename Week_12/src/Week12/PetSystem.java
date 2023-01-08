package Week12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PetSystem {

	public static void main(String[] args) {
		
		//primitive
		//primitive types are not classes
		int x = 5;
		
		//non-primitive
		Scanner sc = new Scanner(System.in);
		Random r  = new Random();
		
		//className objName = new className();
		//d1 is the new dog
		Dog d1 = new Dog();
		d1.age = 2;
		d1.breed = "bulldog";
		d1.color = "black";
		d1.name = "max";
		d1.size = "medium";
		
		Dog d2 = new Dog();
		d2.age = 5;
		d2.breed = "golden";
		d2.color = "brown";
		d2.name = "lucky";
		d2.size = "large";
		
		System.out.println(d1.color); 
		System.out.println(d2.color); 
		
		d1.eat();
		d2.eat();
		d1.sleep();
		
		System.out.println(d1); //It's print of its hash code.
		System.out.println(d1.toString()); //It's still prints hash code.
		
		
		//We override toString method to return Dog's information, you can check Dog class.
		System.out.println(d2.toString()); //Now, this is going to print Dog information
		
		System.out.println("-----------------------");
		
		Dog[] dogArray = new Dog[2];
		dogArray[0] = new Dog();
		dogArray[0].name = "Kral";
		
		System.out.println("-----------------------");
		
		ArrayList<Dog> pets = new ArrayList<Dog>();
		
		pets.add(d1);
		pets.add(d2);
		
		System.out.println(pets.get(0).color);
		
		/*
		Dog d4; This is just DECLARATIUON we are not created new Dog.
		We should write Dog d4 = new Dog();
		d4 = new //INSTANTIATON
	    Dog(); //INITIALIZATION
	    */
	}

}
