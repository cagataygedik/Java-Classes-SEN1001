package Week13;

import java.util.Arrays;

public class MainCourse {

	public static void main(String[] args) {
		
		Student s1 = new Student("Çağatay", 0, "SEN");
		Student s2 = new Student("Göktürk", 3.9, "SEN");
		
		Course java = new Course("SEN1001", "Intro to Programming", 4);
		
		System.out.println(java.getCode() + " "+ java.getName());
		
		System.out.println("In this course "+ java.getLimit() + " can enroll");

		java.getEnrolledStudents(); //array
		System.out.println(java.getEnrolledStudents()[0]);
		System.out.println(java.getEnrolledStudents()[1]);
		System.out.println(java.getEnrolledStudents()[2]);
		System.out.println(java.getEnrolledStudents()[3]);
		
		System.out.println(Arrays.toString(java.getEnrolledStudents()));
		//[null, null, null, null]
		
		java.addStudents(s1);
		
		System.out.println(Arrays.toString(java.getEnrolledStudents()));
		//[Fullname:Çağatay, ID:2529626, P:27#@8Ko5yC GPA(-), null, null, null]
		
		java.addStudents(s2);
		System.out.println(Arrays.toString(java.getEnrolledStudents()));
		//[Fullname:Çağatay, ID:3931041, P:BzQd$T*?VQ GPA(-), Fullname:Göktürk, ID:6665378, P:TN2nF457Z3 GPA(3.9), null, null]

		
	}

}
