package Week12;

public class CarSystem {

	public static void main(String[] args) {
		
		Car volvo = new Car();
		
		volvo.speed = 50;
		
		volvo.goFaster();
		System.out.println(volvo.speed); //"70"
		System.out.println(volvo.toString()); //"current speed: 70"
		
		
		Car audi = new Car();
		
		audi.speed = 100;
		audi.stop();
		System.out.println(audi.toString()); //"current speed: 0"
		
		System.out.println("--------------------");
		
		//primitives
		int i = 5 , j = 10;
		System.out.println(i+ "," +j); //5,10
		i++;
		System.out.println(i+ "," +j); //6,10
		i = j;
		System.out.println(i+ "," +j); //10,10
		i++;
		System.out.println(i+ "," +j); //11,10
		j++;
		System.out.println(i+ "," +j); //11,11
		
		System.out.println("--------------------");
		
		//objects
		Car c1 = new Car();
		c1.speed = 10;
		
		Car c2 = new Car();
		c2.speed = 20;
		
		System.out.println(c1.speed+","+c2.speed); //10,20
		c1.goFaster();
		System.out.println(c1.speed+","+c2.speed); //30,20
		c2=c1; 
		System.out.println(c1.speed+","+c2.speed); //30,30
		c1.goFaster();
		System.out.println(c1.speed+","+c2.speed); //50,50
		c2.stop();
		System.out.println(c1.speed+","+c2.speed); //0,0
		
		System.out.println("--------------------");
		
		c2 = new Car(); //We broke the exist one, this is new car 
		c2.goFaster();
		System.out.println(c1.speed+ ","+c2.speed); //0,20
		
	}

}
