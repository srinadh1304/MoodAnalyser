package com.bridgelabz.moodanalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad(){
		MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in sad mood");
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertEquals("SAD",mood);
	}
	
	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any mood");
		String mood = moodAnalyser.analyzeMood();
		Assert.assertEquals("HAPPY", mood);
	}
}