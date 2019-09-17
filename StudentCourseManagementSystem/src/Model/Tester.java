package Model;

import java.util.Hashtable;

public class Tester {

	public static void main(String[] args) {

		// Create hashtable to hold course data.

		Hashtable<String, Course> h = new Hashtable<String, Course>();

		Database fall_winter_2018_2019 = new Database(h); // Uses hashtable as a database to hold course data. 

		// Add courses beyond this point with the following notation:

		Course c1 = new Course("EECS 1021", 3, "B"); // Creates course with name "EECS 1021", 3 credits, and a final
														// grade of B.

		fall_winter_2018_2019.addCourse(c1); // Adds course to database.

		Course c2 = new Course("MATH 1013", 3, "A"); // Mind the change of Course type variable from c1 to c2. Continue
														// to change course variable name when adding more courses.

		fall_winter_2018_2019.addCourse(c2); // Adds course to database.

		// Continue to add as many courses as you wish.
		
		
		
		// Add courses into database until this point.

		System.out.println("Your cumulative grade point average is: " + fall_winter_2018_2019.calculateGPA()); // Calculates and returns double value of GPA. 

		System.out.println("Final grade for EECS 1021 is: " + fall_winter_2018_2019.getCourseObject("EECS 1021").getGrade()); // Returns grade for any course in the database.   
																													
	}

}
