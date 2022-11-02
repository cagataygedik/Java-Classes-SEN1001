package Week3;

public class Week3 {

	public static void main(String[] args) {

		System.out.println(3456789); // prints and goes to the next line
		System.out.println("asdfghjklıuytre234567890()/&%+^'");
		System.out.println("welcome to " + " week " + 2);
		System.out.println("sec3\t");
		//this is a single line comment
		
		//variables = degiskenler
		//data types - 8 
		//datatype variablename = value;
		int score=20; //-2^32 2^32 whole numbers
		double currency = 18.5; //-2^64 2^64
		char gender = 'F'; // one character
		String userName="çağatay"; //sky is the limit
		
//		double a = 5;
//		System.out.println(a);
		System.out.println(userName);
		System.out.println(gender);
		System.out.println(currency);
		System.out.println(score);
		
		System.out.println("My score is "+score);
		System.out.println(gender+" "+userName);
		System.out.println(currency+score);
		
		//case sensitive
		int Age=40;
		int AGE=9;
		int aGE;
		String userPassword;//declare
		userPassword="12345";//assign
		userPassword="qwert";//update - overwrite
		
//		int a;
//		int b;
//		int c;
//		int d;
		
		int a=4,b=5,c=5,d=5;
		System.out.println(a);
		a=-10; //update - overwrite
		System.out.println(a);
		
		int currentYear=2022;
		int birthYear = 2002;
		int age=currentYear-birthYear;
		System.out.println("I'm " + age+ " years old");
		
	}

}
