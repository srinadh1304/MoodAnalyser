package com.bridgelabz.moodanalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad(){
		MoodAnalyser moodAnalyzer = new MoodAnalyser("This is a sad message");
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertEquals("SAD",mood);
	}

	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a happy message");
		String mood = moodAnalyser.analyzeMood();
		Assert.assertEquals("HAPPY", mood);
	}

	public void givenMessage_WhenNull_ShouldThrowMoodAnalysisNullException() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
		try {
			moodAnalyzer.analyzeMood();
		} catch (MoodAnalyzerException e) {
			Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_NULL, e.type);
		}

	}

	@Test
	public void givenMessage_WhenEmpty_ShouldThrowMoodAnalysisEmptyException() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser("");
		try {
			moodAnalyzer.analyzeMood();
		} catch (MoodAnalyzerException e) {
			Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
}