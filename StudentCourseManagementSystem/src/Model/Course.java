package Model;

public class Course {

	String name;
	int credits;
	String grade;
	double gradePoints;
	double points;
	
	/*//
	 * Grade point values.
	 * A+ = 9
	 * A = 8
	 * B+ = 7
	 * B = 6
	 * C+ = 5
	 * C = 4
	 * D+ = 3
	 * D = 2
	 * E = 1
	 * F = 0
	 */
	
	public Course(String name, int credits, String grade) {
		
		this.name = name;
		this.credits = credits;
		this.grade = grade;
		if(this.grade.equals("A+")) {
			this.gradePoints = 9.0;
		}
		else if(this.grade.equals("A")){
			this.gradePoints = 8.0;
		}
		else if(this.grade.equals("B+")){
			this.gradePoints = 7.0;
		}
		else if(this.grade.equals("B")){
			this.gradePoints = 6.0;
		}
		else if(this.grade.equals("C+")){
			this.gradePoints = 5.0;
		}
		else if(this.grade.equals("C")){
			this.gradePoints = 4.0;
		}
		else if(this.grade.equals("D+")){
			this.gradePoints = 3.0;
		}
		else if(this.grade.equals("D")){
			this.gradePoints = 2.0;
		}
		else if(this.grade.equals("E")){
			this.gradePoints = 1.0;
		}
		else {
			this.gradePoints = 0.0;
		}
		this.points = this.gradePoints * this.credits;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getGradePoints() {
		return gradePoints;
	}

	public void setGradePoints(double gradePoints) {
		this.gradePoints = gradePoints;
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}
	
	
}
