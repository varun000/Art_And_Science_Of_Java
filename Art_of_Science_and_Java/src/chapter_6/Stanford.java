package chapter_6;

import acm.program.*;

public class Stanford extends ConsoleProgram {
	public void run() {
		Student stud = new Student("Sai Varun Vukkem", 11068716);
		double credits = readDouble("Credits earned: ");
		stud.setCredits(credits);
		stud.setPaidUp(true);
		
		if (stud.isEligibleToGraduate()) {
			println (stud.getName() + " is eligible to graduate.");
		} else {
			println (stud.getName() + " is not eligible to graduate.");
		}
		
	}
}
