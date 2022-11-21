package Midterm;

public class ForLoops {

	public static void main(String[] args) {
		
		for(int a = 0; a < 4; a++) {
			for (int b = 0; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int x = 4; x >= 1; x--) {
			for (int y = 0; y < x; y++) {
				System.out.print("-");
			}
			System.out.println();
		}

	}

}
