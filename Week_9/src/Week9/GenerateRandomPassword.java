package Week9;

import java.util.Arrays;
import java.util.Random;

public class GenerateRandomPassword {
	
	        //0-9 - 0
			//a-z - 1
			//A-Z - 2
			//?,*,#,$,@ -3

	public static void main(String[] args) {
	  String[] passwords=new String[20];
	  
      for (int i = 0; i < passwords.length; i++) {
			
			passwords[i]=generatePassword(8);
		}
      
		System.out.println(Arrays.toString(passwords));

	}
	
	public static String generatePassword(int passwordLength) {
		char[] symbols = {'?','*','#','$','@'};
		char[] lowerCase = new char[26];
		char[] upperCase = new char[26];
		
		for (int i = 0; i < lowerCase.length; i++) {
			lowerCase[i] = (char)('a'+i);
		}
		//System.out.println(Arrays.toString(lowerCase));
		
		for (int i = 0; i < upperCase.length; i++) {
			upperCase[i] = (char)('A'+i);
		}
		//System.out.println(Arrays.toString(upperCase));
		Random r = new Random();
		String password = "";
		
		for(int i = 0; i < passwordLength; i++) {
		
		int set = r.nextInt(4); //0-3
		
		switch(set) {
		case 0: //0-9
			password += r.nextInt(10); //0-9
			break;
		
		case 1: //a-z
			password += lowerCase[r.nextInt(lowerCase.length)];
			break;
		
		case 2: //A-Z
			password += upperCase[r.nextInt(upperCase.length)];
			break;
			
		default: //symbols
			password += symbols[r.nextInt(symbols.length)];
			break;
		}
		}
		return password;
		}
	

}
