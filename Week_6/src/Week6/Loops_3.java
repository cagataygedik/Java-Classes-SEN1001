package Week6;

public class Loops_3 {

	public static void main(String[] args) {
		//***
		//***
		//***
		for (int j = 0; j < 3; j++) {
			for(int i = 0; i < 3; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//**
		//**
		//**
		//**
		
		System.out.println("-----");
		
		for (int i = 0; i < 4; i++) { //row
			for (int j = 0; j < 2 ; j++) { //column
				System.out.print("*");
			}
			System.out.println();
		}
		
		//*
		//**
		//***
		//****
		
		System.out.println("-----");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----");
		
		//****
		//***
		//**
		//*
		
		for (int i = 4; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
