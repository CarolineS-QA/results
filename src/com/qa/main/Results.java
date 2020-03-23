package com.qa.main;

public class Results {
	// creates the 5 variables
	private int Physics = 150;
	private int Chemistry = 50;
	private int Biology = 150;
	private int TotalMarks = Physics + Chemistry + Biology;
	private int Percentage = (TotalMarks * 100)/450;

	public String examResultsBreakdown() { //returns each exam result and a total
		return "Physics mark: " + Physics
				+ "\nChemistry mark: " + Chemistry //used \n to put each on a new line
				+ "\nBiology mark: " + Biology
				+ "\nTotal Marks: " + TotalMarks;
	}
	
	public String examOverallPercentage() { //returns the percentage
		return "Overall percentage: " + Percentage + "%";
	}
}
