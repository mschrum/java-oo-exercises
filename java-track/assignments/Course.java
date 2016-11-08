import java.util.ArrayList;
import java.util.Objects;

public class Course {
	private String name;
	private int credits;
	private int remainingSeats;
	private Student [] studentRoster;
	private static final ArrayList <String> allCourses = new ArrayList<String>();

	public Course(String name, int credits, int remainingSeats) {
		this.name = name;
		this.credits = credits;
		this.remainingSeats = remainingSeats;
		this.studentRoster= new Student[this.remainingSeats];
		allCourses.add(this.name);
	}
	
	public static ArrayList<String> getAllCourses(){
		return Course.allCourses;
	}

	public String getName() {
		return name;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getRemainingSeats() {
		return remainingSeats;
	}


	public Student [] getStudentRoster() {
		return studentRoster;
	}

	public boolean addStudent(Student s){
		if (this.remainingSeats>0) {
			for (int i=0; i<studentRoster.length; i++){
				if (studentRoster[i]!=null){
					if (s.getName()==(studentRoster[i].getName())){
						return false;
					}
				}
			}
			studentRoster[this.remainingSeats-1]=s;
			this.remainingSeats-=1;
			return true;
		}
		return false;
	}

	public String generateRoster(){
		String roster="";
		for (int i=0; i<studentRoster.length; i++){
			if (studentRoster[i]!=null){
				roster += studentRoster[i].getName();
			}
		}
		return roster;
	}
	
	public double averageGPA(){
		double totGPA = 0;
		int totalStudents=0;
		for (int i=0; i<studentRoster.length; i++) {
			if (this.studentRoster[i]!=null){
				totGPA+=studentRoster[i].getGPA();
				totalStudents+=1;
			}
		}
		double avgGPA = Math.round((totGPA/totalStudents)*100.00)/100.00;
		return avgGPA;
	}

	public String toString() {
		return name + " " + credits;
	}

	@Override
	public boolean equals(Object c){
		
		//self check
		if (this == c)
			return true;
		
		if (c == null)
			return false;
		
		
		//type check and cast
		if(getClass()!=c.getClass())
			return false;
		
		
		Course course = (Course) c;
		
		//field comparison
		return Objects.equals(name, course.getName()) && Objects.equals(credits, course.getCredits());		
		
	}

}
