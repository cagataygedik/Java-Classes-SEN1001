package Week11;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//!!ArrayList can grow automatically!!
		
		int[] myArray = new int[3];//|0|0|0
		myArray[0] = 10;
		System.out.println(myArray);
		
		System.out.println("----------------");
		
		
		/*NOTE: We can print ArrayList directly -> System.out.println(days);
		 * but if we print Arrays it gives us hash code of it. -> System.out.println(myArray);
		 */
		
		ArrayList<String> days = new ArrayList<String>();
		System.out.println(days.size());
		days.add("monday");
		System.out.println(days.size());
		days.add("tuesday");
		days.add("wednesday");
		days.add("thursday");
		days.add("friday");
		days.add("saturday");
		System.out.println(days.size());
		System.out.println(days);
		
		days.add(6, "sunday");
		System.out.println(days);
		
		System.out.println(days.get(3));
		
		for (int i = 0; i < days.size(); i++) {
			System.out.println(days.get(i));
		}
		
		days.remove(5);
		System.out.println(days);
		
		/*
		 * days.add(11, "monday") -> NO. We can not do that.
		 */
		
		days.contains("monday"); // -> BOOLEAN
		
		if(days.contains("monday")) {
			System.out.println("we have monday");
		}
		
		else 
			System.out.println("we don't");
		
		
		System.out.println("----------------");
		
		
		System.out.println(days.indexOf("friday")); //Gives us the index.
		System.out.println(days.indexOf("Friday")); //Gives us "-1". because we don't have it.
		
		System.out.println("----------------");
		
		if(days.isEmpty())
			System.out.println("no elements left");
		
		else
			System.out.println(days);
		
		System.out.println("----------------");
		
		// This line of code prints the days too.
		for (String value : days) {
			System.out.println(value);
		}
		
		System.out.println("----------------");
		
		days.clear();
		System.out.println(days);
			
		}
	}


