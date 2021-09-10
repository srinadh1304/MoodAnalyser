package com.bridgelabz.moodanalyzer;
import com.bridgelabz.moodanalyzer.MoodAnalyzerException.ExceptionType;

public class MoodAnalyser {
	String message;
	public MoodAnalyser() {

	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyzeMood() throws MoodAnalyzerException {

		try {
			if (message.length() == 0) {
				throw new MoodAnalyzerException(ExceptionType.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");
			}
			if (message.toLowerCase().contains("sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			throw new MoodAnalyzerException(ExceptionType.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
		}
	}
}
