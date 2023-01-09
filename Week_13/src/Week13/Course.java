package Week13;

public class Course {
	
	private String code;
	private String name;
	private String classroom;
	private int limit;
	private Student[] enrolledStudents;
	
	
	public Course(String code, String name, int limit) {
		
		this.code = code;
		this.name = name;
		this.limit = limit;
		this.enrolledStudents = new Student[limit];
		
	}


	public String getCode() {
		return code;
	}
	
	
	public String getName() {
		return name;
	}


	public String getClassroom() {
		return classroom;
	}


	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}


	public int getLimit() {
		return limit;
	}


	public void setLimit(int limit) {
		this.limit = limit;
	}


	public Student[] getEnrolledStudents() {
		return enrolledStudents;
	}


	public void setEnrolledStudents(Student[] enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}
	
	public void addStudents(Student stu) {

		for (int i = 0; i < enrolledStudents.length; i++) {
			if (enrolledStudents[i] == null) {
				enrolledStudents[i] = stu;
				System.out.println("Student was added");
				return;
			} 
		}
		System.out.println("Cannot enroll");
	}
	
	public void deleteStudent(Student st) {
		boolean isDeleted = false;
		
		for (int i = 0; i < enrolledStudents.length; i++) {
			if(enrolledStudents[i].getStudentID().equals(st.getStudentID())) {
				enrolledStudents[i] = null;
				isDeleted = true;
				System.out.println("student deleted");
				break;
			}
		}
		if (!isDeleted) {
			System.out.println("cannot deleted");
		}
	}
	
	
}
