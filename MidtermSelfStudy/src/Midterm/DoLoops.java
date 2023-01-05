package Midterm;

public class DoLoops {

	 public static void main(String[] args) {
	        int width = 20;
	        int heigth = 30;
	        int area = 0;
	        
	        calculateArea(width, heigth, area);
	        System.out.println("Area:" + area);
	    }
	    
	    public static int calculateArea(int width, int heigth, int area) {
	        return width * heigth;
	    }
	    
	}

