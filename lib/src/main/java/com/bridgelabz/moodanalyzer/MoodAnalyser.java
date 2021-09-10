package com.bridgelabz.moodanalyzer;

public class MoodAnalyser {
	String message;
	public MoodAnalyser() {

	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyzeMood() {
		try {
			if (message.toLowerCase().contains("sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} 
		catch (NullPointerException e) {
			return "HAPPY";
		}
	}
}
