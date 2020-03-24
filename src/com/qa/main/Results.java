package com.qa.main;

public class Results {
	// creates the 5 variables
	private int Physics = 150;
	private int Chemistry = 100; // change it's value and run to see pass/fail in the
									// console
	private int Biology = 89;
	private int TotalMarks = Physics + Chemistry + Biology;
	private int Percentage = (TotalMarks * 100) / 450;
	// adding pass variables for each exams individual %
	private int PhysicsPercent = (Physics * 100) / 150; // should expect a score of 90 to pass
	private int ChemistryPercent = (Chemistry * 100) / 150;
	private int BiologyPercent = (Biology * 100) / 150;

	public String examResultsBreakdown() { // returns each exam result and a total
		return "-All Marks- \nPhysics mark: " + Physics + "\nChemistry mark: " + Chemistry // used \n to put each on a
																							// new line
				+ "\nBiology mark: " + Biology + "\nTotal Marks: " + TotalMarks + "\n";
	}

	public String examOverallPercentage() { // returns the percentage and a pass/fail message
		// important that >= is used instead of > if you want a mark of 60% to pass.
		// Also && = and.
		// if total % is >= 60, and each exam % is >= 60% (90 marks)
		if (Percentage >= 60 && PhysicsPercent >= 60 && ChemistryPercent >= 60 && BiologyPercent >= 60) {
			// pass return message on new line
			return "Overall percentage: " + Percentage + "%" + "\nCongrats you passed!";

		} else { // will run through and print depending on which exams have failed.
			System.out.println("Sorry, you failed the following exams:");
			// physics fail message, only shows if failed physics
			if (PhysicsPercent < 60) {
				System.out.println("You failed Physics." + "\nYour result " + PhysicsPercent + "%");
			}
			// biology fail message, only show if failed biology
			if (BiologyPercent < 60) {
				System.out.println("You failed Biology." + "\nYour result " + BiologyPercent + "%");
			}
			// chemistry fail message, only show if failed chemistry
			if (ChemistryPercent < 60) {
				System.out.println("You failed Chemistry." + "\nYour result " + ChemistryPercent + "%");
			}
			// always returns the overall fail message
			return "\nYour Overall percentage: " + Percentage + "%";
			// will try and add a fail counter - see next commit!
		}
	}
}
