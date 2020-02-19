package com.Bridgelabz;

import com.mood.exceptions.MoodAnalysisexceptions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class moodAnalyzer {
    private  MoodAnalyzer moodAnalyzerobj;

    @Before
    public void initialise() {
         moodAnalyzerobj = new MoodAnalyzer();
    }

    @Test
    public void givenSAD_ShouldReturnSAD() {
        String mood= null;
        try {
            mood = moodAnalyzerobj.analyzer("SAD");
            Assert.assertEquals("SAD",mood);
        } catch (MoodAnalysisexceptions moodAnalysisexceptions) {
            moodAnalysisexceptions.printStackTrace();
        }
    }

    @Test
    public void givenInput_WhenHappy_ShouldReturnHAppy() {
        String mood = null;
        try {
            mood = moodAnalyzerobj.analyzer("HAPPY");
            Assert.assertEquals("HAPPY",mood);
        } catch (MoodAnalysisexceptions moodAnalysisexceptions) {
            moodAnalysisexceptions.printStackTrace();
        }
    }

    @Test
    public void givenInput_WhenNull_ShouldReturnException() {
        String mood = null;
        try {
            mood = moodAnalyzerobj.analyzer(null);
            Assert.assertEquals("HAPPY",mood);

        } catch (MoodAnalysisexceptions moodAnalysisexceptions) {
            moodAnalysisexceptions.printStackTrace();
        }
    }
    @Test
    public void givenInput_WhenEmpty_ShouldReturnException() {
        String mood = null;
        try {
            mood = moodAnalyzerobj.analyzer("");
            Assert.assertEquals("HAPPY",mood);

        } catch (MoodAnalysisexceptions moodAnalysisexceptions) {
            moodAnalysisexceptions.printStackTrace();
        }
    }

}
