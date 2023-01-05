package Week9;

import java.util.Random;
import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		
		int[] numbers = new int[3];
		int sum = 0;
		
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < numbers.length; i++) {
			//numbers[i]=rnd.nextInt(100);
			System.out.println("Enter the "+(i+1)+". value :");
			numbers[i] = sc.nextInt();
			sum += numbers[i];
		}
		
		Arrays1.printArray(numbers);
		System.out.println("AVG " + (sum/numbers.length));
	}
}
