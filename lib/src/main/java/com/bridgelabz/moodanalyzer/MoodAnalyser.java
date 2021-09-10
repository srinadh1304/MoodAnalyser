package com.bridgelabz.moodanalyzer;

public class MoodAnalyser {
	public String analyzeMood(String message) {
		if(message.contains("sad")) {
			return "SAD";
		}
		else {
			return "HAPPY";
		}
	}
}
