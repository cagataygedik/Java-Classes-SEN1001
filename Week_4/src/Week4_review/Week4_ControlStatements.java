package Week4_review;

public class Week4_ControlStatements {

	public static void main(String[] args) {
		int grade=60;
	
		//if(condition)
		// statement
		//else
		//statement
		
		//<,>,<=,>=, 
		//= assigment
		//== are they equal?
		//!= are they not equal?
		
		if(grade>=60) {
			String letter="A";
			System.out.println("passed");
			System.out.println("well done :)");
		}
		else {
			System.out.println("failed");
			System.out.println(":(");
		}
		System.out.println("Program finised");

		
		//>90 A
		//>80 B
		//>70 C
		//>60 D
		//>59 F
		
		grade=75;
		if(grade>90) {
			System.out.println("A");
			System.out.println("congrats.");
		}
		else if(grade>80)
			System.out.println("B");
		else if(grade>70) {
			System.out.println("C");
			System.out.println("not bad");
		}
		else if(grade>60)
			System.out.println("D");
		else {
			System.out.println("F");
			System.out.println("try again");
		}
		
		//if(condition)
			//statement
		//if(condition)
			//statement
		
		
		//if(condition)
			//statement
		//else if(condition)
			//statement
		
		//nested if statements
		int x=9, y=3;
		if(x>6) {
			if(y>6)
				System.out.println("bigger than 6");
			else
				System.out.println("also less than 6");
		}
			else
				System.out.println("less than 6");
		
		if(x!=y) {
			System.out.println("they are not equal");
		}	
		else {
			System.out.println("they are equal");
		}
			
	}

}
