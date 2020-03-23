package com.qa.main;

public class Main {

	public static void main(String[] args) {
		//creates an instance of class 'results'
		Results results = new Results();
		// prints results to console
		System.out.println(results.examResultsBreakdown());
		// prints overall percentage to console
		System.out.println(results.examOverallPercentage());

	}

}
