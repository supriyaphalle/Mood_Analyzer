package com.Bridgelabz;

import com.mood.exceptions.MoodAnalysisexceptions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class moodAnalyzer {
    @Test
    public void givenSAD_ShouldReturnSAD() {

        String mood= null;
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("SAD");
           mood = moodAnalyzer.analyzer();
            Assert.assertEquals("SAD",mood);
        } catch (MoodAnalysisexceptions moodAnalysisexceptions) {
            moodAnalysisexceptions.printStackTrace();
        }
    }

    @Test
    public void givenInput_WhenHappy_ShouldReturnHAppy() {
        String mood = null;
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("HAPPY");
            mood = moodAnalyzer.analyzer();
            Assert.assertEquals("HAPPY",mood);
        } catch (MoodAnalysisexceptions moodAnalysisexceptions) {
            moodAnalysisexceptions.printStackTrace();
        }
    }

    @Test
    public void givenInput_WhenNull_ShouldReturnException() {
        String mood = null;
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
            mood = moodAnalyzer.analyzer();
            Assert.assertEquals("HAPPY",mood);

        } catch (MoodAnalysisexceptions moodAnalysisexceptions) {
            moodAnalysisexceptions.printStackTrace();
        }
    }
    @Test
    public void givenInput_WhenEmpty_ShouldReturnException() {
        String mood = null;
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
            mood = moodAnalyzer.analyzer();
            Assert.assertEquals("HAPPY",mood);

        } catch (MoodAnalysisexceptions moodAnalysisexceptions) {
            moodAnalysisexceptions.printStackTrace();
        }
    }

    @Test
    public void givenInput_whenforDefaultConstructor_ShouldReturnHappy() {
        String mood=null;
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
            mood = moodAnalyzer.analyzer();
            Assert.assertEquals("HAPPY",mood);
        }catch (MoodAnalysisexceptions moodAnalysisexceptions){
            moodAnalysisexceptions.printStackTrace();
        }
    }

    @Test
    public void givenInput_whenIamInSadMood_ShouldReturnSad() {
        String mood=null;
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in SAD mood");
            mood = moodAnalyzer.analyzer();
            Assert.assertEquals("SAD",mood);
        }catch (MoodAnalysisexceptions moodAnalysisexceptions){
            moodAnalysisexceptions.printStackTrace();
        }
    }

    @Test
    public void givenInput_whenIamInHappyMood_ShouldReturnSad() {
        String mood=null;
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in HAPPY mood");
            mood = moodAnalyzer.analyzer();
            Assert.assertNotEquals("SAD",mood);
        }catch (MoodAnalysisexceptions moodAnalysisexceptions){
            moodAnalysisexceptions.printStackTrace();
        }
    }



}
