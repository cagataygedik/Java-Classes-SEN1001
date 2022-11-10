package Week5;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		//login part- username, password(int), email
		// get operator
		//get 2 numbers
		
		//AND OR
				/*
				 * AND &&
				 * T&&T=T
				 * T&&F=F
				 * F&&T=F
				 * F&&F=F
				 * 
				 * OR ||
				 * T||T=T
				 * T||F=T
				 * F||T=T
				 * F||F=F
				 * 
				 * 
				 * */
		
		Scanner login = new Scanner(System.in);
		System.out.println("give me you username");
		String userN = login.next();
		
		System.out.println("Enter your password");
		int password = login.nextInt();
		String email = "celil.gedik@bahcesehir.edu.tr";
		if(password==1234 && email=="celil.gedik@bahcesehir.edu.tr") {
			System.out.println("Welcome " + userN);
			
			
			System.out.println("Please select the operator");
			System.out.println("Press 1 for +");
			System.out.println("Press 2 for -");
			System.out.println("Press 3 for *");
			System.out.println("Press 4 for /");
			System.out.println("Press 5 for %");
			int operator = login.nextInt();
			System.out.println("Enter number1");
			int n1 = login.nextInt();
			System.out.println("Enter number2");
			int n2 = login.nextInt();
			
			// THAT'S ONE IF-ELSE VERSION
			/*
			if(operator == 1) {
				System.out.println(n1+ "+" +n2 + "=" +(n1 + n2));
			}
			else if(operator == 2) {
				System.out.println(n1+ "-" +n2 + "=" +(n1 - n2));
			}
			
			else if(operator == 3) {
				
				System.out.println(n1+ "*" +n2 + "=" +(n1 * n2));
			}
				
			}
			
			else if(operator == 4) {
			    if(n2 != 0) {
				System.out.println(n1+ "/" +n2 + "=" +(n1 / n2));
				}
				else {
					System.out.println(" / by zero");
				}
			}
			
			else if(operator == 5) {
				System.out.println(n1+ "%" +n2 + "=" +(n1 % n2));
			}
			else {
				System.out.println("Give me number between 1 and 5");
			}
			*/
			
			
			//THAT ONE IS SWITCH-CASE VERSION
			switch(operator) {
			case 1:
				System.out.println(n1 +"+" +n2+ "=" +(n1 + n2));
				break;
			case 2:
				System.out.println(n1+ "-" +n2+ "="+(n1 - n2));
				break;
			case 3:
				System.out.println(n1+ "*" +n2+ "=" +(n1 * n2));
				break;
			case 4:
				if(n2!=0)
					System.out.println(n1+ "/" +n2+ "=" +(n1 / n2));
				else
					System.out.println("/ by zero");
				break;
			case 5: 
				System.out.println(n1+ "%" +n2+ "=" +(n1 % n2));
				break;
			default:
				System.out.println("cannot do that");
			}
			
		}
		else {
			System.out.println("invalid password");
		}

		
		
		
		//EVEN OR ODD
		System.out.println("Give me a number divisible by six");
		int number = login.nextInt();
		if(number % 3 == 0 && number % 2 == 0) {
			System.out.println("is divisible by 6");
		} else {
			System.out.println("Not divisible by 6");
		}
		
		//inline if
		System.out.println(number % 2 == 0 ? "EVEN" : "ODD");
	}
	
}
