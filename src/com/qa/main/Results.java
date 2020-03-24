package com.qa.main;

public class Results {
	// Variables for each exam mark
	// change the values and run to see pass/fail
	private int physicsMark = 120;
	private int chemistryMark = 9;
	private int biologyMark = 125;
	// Total and % marks for all 3 exams
	private int totalMarks = physicsMark + chemistryMark + biologyMark;
	private int overallPercentage = (totalMarks * 100) / 450;
	// adding pass variables for each exams individual %
	private int physicsPercent = (physicsMark * 100) / 150; // should expect a score of 90 to pass
	private int chemistryPercent = (chemistryMark * 100) / 150;
	private int biologyPercent = (biologyMark * 100) / 150;

	public String examResultsBreakdown() { // returns each exam result and a total
		return "-All Marks- \nPhysics mark: " + physicsMark + "\nChemistry mark: " + chemistryMark // used \n to put
																									// each on a
		// new line
				+ "\nBiology mark: " + biologyMark + "\nTotal Marks: " + totalMarks + "\n";
	}

	public String examOverallPercentage() { // returns the percentage and a pass/fail message
		// important that >= is used instead of > if you want a mark of 60% to pass.
		// Also && = and.
		// if total % is >= 60, and each exam % is >= 60% (90 marks)
		if (overallPercentage >= 60 && physicsPercent >= 60 && chemistryPercent >= 60 && biologyPercent >= 60) {
			// pass return message on new line
			return "Congrats you passed!" + "\nYour overall percentage: " + overallPercentage + "%";

		} else { // will run through and print depending on which exams have failed.
			// created a variable to track number of failed exams.
			int failCount = 0;
			System.out.println("Sorry, you failed the following exams:");
			// physics fail message, only shows if failed physics and adds +1 to fail
			// counter
			if (physicsPercent < 60) {
				System.out.println("You failed Physics." + "\nYour result " + physicsPercent + "%");
				failCount++;
			}
			// biology fail message, only show if failed biology and adds +1 to fail counter
			if (biologyPercent < 60) {
				System.out.println("You failed Biology." + "\nYour result " + biologyPercent + "%");
				failCount++;
			}
			// chemistry fail message, only show if failed chemistry and adds +1 to fail
			// counter
			if (chemistryPercent < 60) {
				System.out.println("You failed Chemistry." + "\nYour result " + chemistryPercent + "%");
				failCount++;
			}
			// always returns the overall fail message - includes fail count.
			return "\nYou failed " + failCount + " exam(s). Your Overall percentage was: " + overallPercentage + "%";
		}
	}
}

//I have changed the variable names to reflect goodPracticeNamingConvention
//Extra thing I could do: change exam/exams depending on if failCount > 1
