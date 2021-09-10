package com.bridgelabz.moodanalyzer;

public class MoodAnalyser {
	String message;
	public MoodAnalyser() {

	}

	public MoodAnalyser(String message){
		this.message = message;
	}
	
	public String analyzeMood() {
		if(message.contains("sad")) {
			return "SAD";
		}
		else {
			return "HAPPY";
		}
	}
}
