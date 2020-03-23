package com.qa.main;

public class Results {
	// creates the 5 variables
	private int Physics = 150;
	private int Chemistry = 89; //never liked chemistry, change it's value and run to see pass/fail in the console
	private int Biology = 150;
	private int TotalMarks = Physics + Chemistry + Biology;
	private int Percentage = (TotalMarks * 100)/450;
	// adding pass variables for each exams individual %
	private int PhysicsPercent = (Physics * 100)/150; // should expect a score of 90 to pass
	private double ChemistryPercent = (Chemistry * 100)/150;
	private int BiologyPercent = (Biology * 100)/150;

	public String examResultsBreakdown() { //returns each exam result and a total
		return "Physics mark: " + Physics
				+ "\nChemistry mark: " + Chemistry //used \n to put each on a new line
				+ "\nBiology mark: " + Biology
				+ "\nTotal Marks: " + TotalMarks;
	}
	
	public String examOverallPercentage() { //returns the percentage and a pass/fail message
		//important that >= is used instead of > if you want a mark of 60% to pass. Also && = and.
		if (Percentage >= 60 && PhysicsPercent >= 60 && ChemistryPercent >= 60 && BiologyPercent >= 60) { //if total % is >= 60, and each exam % is >= 60% (90 marks)
			return "Overall percentage: " + Percentage + "%"
					+"\n Congrats you passed!"; //pass return message on new line
		} else {
			return  "Overall percentage: " + Percentage + "%"
				+"\n You failed overall :("; //fail message on new line
		}
	}
}
