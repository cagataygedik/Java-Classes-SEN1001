package Week13;

public class Student {
	
	//variables
	private String name;
	private String studentID;
	private double gpa;
	private String gender;
	private String department;
	private String password;
		
		
	public Student(String name, double gpa, String department) {
		this.name = name;
		this.studentID = generateID();
		this.gpa = gpa;
		this.department = department;
		this.password = GenerateRandomPassword.generatePassword(10);
	}
	
	
	public static String generateID() {
		String id="";
		for (int i = 0; i < 7; i++) {
			id+=(int)(Math.random()*10); //0.246*10=2.46
		}
		return id;
	}
	
	@Override
	public String toString() {
		String summary= "Fullname:"+name+", ID:"+ studentID+", P:"+password;
		
		if(gpa==0)
			summary+=" GPA(-)";
		
		else
			summary+=" GPA("+gpa+")";
		
		return summary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStudentID() {
		return studentID;
	}


	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
