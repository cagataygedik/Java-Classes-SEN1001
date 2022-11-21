package Week7;

public class RollingADice {
	
	public static void main(String[] args) {
		
		// roll a die 100 times
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		
		for(int i = 0; i < 100; i++) {
			int number = RandomNumbers.generateInt(1, 7);
			
		//if(number == 1)
		//		one++;
		//	else if(number == 2)
		//		two++;
		//	else if(number == 3)
		//		three++;
		//	else if(number == 4)
		//		four++;
		//	else if(number == 5)
		//		five++;
		//	else 
		//		six++;
		//}
			
			switch(number) {
			case 1:
				one++;
				break;
			case 2:
			    two++;
			    break;
			case 3:
				three++;
				break;
			case 4:
				four++;
				break;
			case 5:
				five++;
				break;
			default:
				six++;
				break;
			}
		}
		
		System.out.println("you rolled one " + one + " many times");
		System.out.println("you rolled two " + two + " many times");
		System.out.println("you rolled three " + three + " many times");
		System.out.println("you rolled four " + four + " many times");
		System.out.println("you rolled five " + five + " many times");
		System.out.println("you rolled six " + six + " many times");
		
		
		
		
	}


	}

