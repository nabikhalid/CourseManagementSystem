package Model;
import java.util.Hashtable;
public class Database {
	Hashtable<String, Course> database;
	int numberOfCourses = 0;
	public Database(Hashtable<String, Course> h) {
		this.database = h;
	}
	public void addCourse(Course c) {
		this.database.put(c.getName(), c);
		this.numberOfCourses++;
	}
	public Course getCourseObject(String name) {
		return database.get(name);
	}
	public double calculateGPA() {
		double GPA = 0.0;
		double cCredits = 0.0;
		double cPoints = 0.0;
		for (String s : database.keySet()) {
			cCredits += database.get(s).getCredits();
			cPoints += database.get(s).getPoints();
		}
		GPA = cPoints / cCredits;
		return GPA;
	}
}
