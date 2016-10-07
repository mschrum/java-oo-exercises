
public class Student {
	private String firstName;
	private String lastName;
	private int studentID;
	private int credits;
	private double gpa;

	public Student(String firstName, String lastName, int studentID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.credits = 0;
		this.gpa = 0;
	}
	
	public Student(String firstName, String lastName, int studentID, int credits, double gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.credits = credits;
		this.gpa = gpa;
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}

	public int getStudentID() {
		return studentID;
	}

	public int getCredits() {
		return credits;
	}

	public double getGPA() {
		return gpa;
	}

	public String getClassStanding () {
		String classStanding;
		if (this.credits<30){
			classStanding="Freshman";
		}
		else if (this.credits<60){
			classStanding="Sophomore";
		}
		else if (this.credits<90){
			classStanding="Junior";
		}
		else {
			classStanding="Senior";
		}
		return classStanding;
	}
	
	public void submitGrade(double grade, int credits){
		double qScore=grade*credits;
		double qScoreTotal=this.gpa*this.credits;
		this.credits+=credits;
		double rawGPA=(qScore+qScoreTotal)/this.credits;
		this.gpa=Math.round(rawGPA*1000.00)/1000.00;
	}
	
	public double computeTuition(){
		double tuition;
		int semesters = this.credits/15;
		int leftovers = this.credits%15;
		tuition = (20000*semesters) + (1333.33*leftovers);
		return tuition;
	}
	
	public Student createLegacy(Student s1, Student s2){
		String fname=s1.getName();
		String lname=s2.getName();
		int studentID= s1.getStudentID()+s2.getStudentID();
		double gpa = (s1.getGPA()+s2.getGPA())/2.0;
		gpa=Math.round(gpa*100)/100.00;
		int credits=Math.max(s1.getCredits(), s2.getCredits());
		Student legacy = new Student(fname, lname, studentID, credits, gpa);
		return legacy;
	}
	
	public String toString(){
		return this.firstName + " " + this.lastName + " " + this.studentID;
	}
}

