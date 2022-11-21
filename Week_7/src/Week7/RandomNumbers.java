package Week7;

public class RandomNumbers {

	public static void main(String[] args) {
		
	  // [0,1)
	  System.out.println(Math.random());
	  
	  System.out.println("-------------");

	  
	  // [1,6]
	  double value = Math.random();
	  
	  //0.000*6=0+1=1.000  0.999*6=5.994+1=6.994
	  value *= 6;
	  value++;
	  
	  //we did casting here, it means we acting value like integer.
	  System.out.println((int)value);
	  
	  System.out.println("-------------");
	  
	  
	}
	
	public static int generateInt(int min, int max) {
		return (int)(Math.random()*(max-min))+min;
	}
	
	
	

}
