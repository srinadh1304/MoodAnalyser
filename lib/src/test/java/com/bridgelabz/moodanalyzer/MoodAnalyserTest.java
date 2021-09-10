package com.bridgelabz.moodanalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad(){
<<<<<<< HEAD
		MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in sad mood");
=======
		MoodAnalyser moodAnalyzer = new MoodAnalyser("This is a sad message");
>>>>>>> mood_analyser_uc2
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertEquals("SAD",mood);
	}
	
	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
<<<<<<< HEAD
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any mood");
=======
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a happy message");
>>>>>>> mood_analyser_uc2
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