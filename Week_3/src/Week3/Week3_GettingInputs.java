package Week3;

import java.util.Scanner;

public class Week3_GettingInputs {
	
	public static void main(String[] args) {
	
	int a = 20;
	Scanner input = new Scanner(System.in);
	
	//prompt
	System.out.println("give me a number");
	int n1 = input.nextInt();
	System.out.println("you entered " + n1);
	
	System.out.println("give me another number");
	int n2 = input.nextInt();
	System.out.println("you entered " + n2);
	
	System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
	
    }
}
