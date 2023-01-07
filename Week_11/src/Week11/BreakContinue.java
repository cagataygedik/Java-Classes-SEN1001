package Week11;

public class BreakContinue {

	public static void main(String[] args) {
	
		/*
		 * continue skips the 7 and iterates again.
		 */
		
		for (int i = 0; i < 10; i++) {
			if(i == 7)
				continue;
			System.out.println(i);
		}

	}

}
