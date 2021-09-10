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
	
	@Test
	public void givenMessage_WhenNull_ShouldReturnHappy() {
		
		MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertEquals("HAPPY",mood);
	}
}