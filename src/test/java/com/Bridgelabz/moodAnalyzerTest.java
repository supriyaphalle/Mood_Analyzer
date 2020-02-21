package com.Bridgelabz;

import com.mood.exceptions.MoodAnalysisexceptions;
import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class moodAnalyzerTest {
    @Test
    public void givenSAD_ShouldReturnSAD() {

        String mood = null;
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("SAD");
            mood = moodAnalyzer.analyzer();
            Assert.assertEquals("SAD", mood);
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
            Assert.assertEquals("HAPPY", mood);
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
            Assert.assertEquals("HAPPY", mood);
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
            Assert.assertEquals("HAPPY", mood);

        } catch (MoodAnalysisexceptions moodAnalysisexceptions) {
            moodAnalysisexceptions.printStackTrace();
        }
    }

    @Test
    public void givenInput_whenforDefaultConstructor_ShouldReturnHappy() {
        String mood = null;
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
            mood = moodAnalyzer.analyzer();
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalysisexceptions moodAnalysisexceptions) {
            moodAnalysisexceptions.printStackTrace();
        }
    }

    //Constructure Parameter
    @Test
    public void givenInput_whenSAD_Constructure_ShouldReturnSad() {
        String mood = null;
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in SAD mood");
            mood = moodAnalyzer.analyzer();
            Assert.assertEquals("SAD", mood);
        } catch (MoodAnalysisexceptions moodAnalysisexceptions) {
            moodAnalysisexceptions.printStackTrace();
        }
    }

    @Test
    public void givenInput_whenHappyConstructure_ShouldReturnSad() {
        String mood = null;
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in HAPPY mood");
            mood = moodAnalyzer.analyzer();
            Assert.assertNotEquals("SAD", mood);
        } catch (MoodAnalysisexceptions moodAnalysisexceptions) {
            moodAnalysisexceptions.printStackTrace();
        }
    }

    ///Enum
    @Test
    public void givenInput_whenEmuncase_ShouldReturnSad() {
        String mood = null;
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
            mood = moodAnalyzer.analyzer();
        } catch (MoodAnalysisexceptions moodAnalysisexceptions) {
            Assert.assertEquals(MoodAnalysisexceptions.entered.Enter_Null, moodAnalysisexceptions.type);

        }
    }

    ///////////////////  TC 4.1 Reflector with default constructure
    @Test
    public void givenDefaultConstructure_MoodAnalyserClass_WhenProper_ShouldReturnObject() {
        MoodAnalyzer moodAnalise = MoodAnalyserFactory.createMoodAnalyzer();
        try {
            String mood = moodAnalise.analyzer();
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalysisexceptions moodAnalysisexceptions) {
            moodAnalysisexceptions.printStackTrace();
        }
    }

    //////////////////////// using equals method
    @Test
    public void givenMoodAnalyserClass_WhenProper_ShouldReturnTrue() {
        MoodAnalyzer moodAnalise = MoodAnalyserFactory.createMoodAnalyzer();
        Assert.assertEquals(new MoodAnalyzer(), moodAnalise);
    }

    ////////////////// TC4.2 crete an exception of class not found
    @Test
    public void givenMoodAnalyser_WhenClassNameImproper_ShouldReturnException() {
        try {
            MoodAnalyserFactory.getConstructor("com.Bridgelabz.MoodAnalyzer1.class", String.class);
        } catch (MoodAnalysisexceptions moodAnalysisexceptions) {
            Assert.assertEquals(MoodAnalysisexceptions.entered.NO_SUCH_CLASS, moodAnalysisexceptions.type);
        }
    }

//////////////////////  TC4.3 create an exception of method not found

    @Test
    public void givenMoodAnalyser_WhenMethodNameImproper_ShouldReturnException() {
        try {
            MoodAnalyserFactory.getConstructor("com.Bridgelabz.MoodAnalyzer", Integer.class);

        } catch (MoodAnalysisexceptions moodAnalysisexceptions) {
            Assert.assertEquals(MoodAnalysisexceptions.entered.NO_SUCH_METHOD, moodAnalysisexceptions.type);
        }

    }

    // UC5- Reflector with parameterrised constructure
    ///////////////////Reflector with parameter constructure
    @Test
    public void givenMoodAnalyserClass_WhenProper_ShouldReturnObject() {
        MoodAnalyzer moodAnalise = MoodAnalyserFactory.createMoodAnalyzerWithParameterConstructure("I an in HAPPY mood");
        try {
            String mood = moodAnalise.analyzer();
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalysisexceptions moodAnalysisexceptions) {
            moodAnalysisexceptions.printStackTrace();
        }
    }

    /////////// using equals method
    @Test
    public void givenMoodAnalyserClass_WhenProper_ShouldReturn() {
        MoodAnalyzer moodAnalise = MoodAnalyserFactory.createMoodAnalyzerWithParameterConstructure("I am in HAPPY mood");
        Assert.assertEquals(new MoodAnalyzer("I am in HAPPY mood"), moodAnalise);
    }
////////////// method invoke


    @Test
    public void givenHappy_WhenProper_ShouldReturn() {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("HAPPY");
            String mood = null;
            mood = MoodAnalyserFactory.callMthodeInvoked(moodAnalyzer, "HAPPY");
            Assert.assertEquals("HAPPY", mood);

        } catch (MoodAnalysisexceptions moodAnalysisexceptions) {
            moodAnalysisexceptions.printStackTrace();
        }
    }

    @Test
    public void givenHappy_WhenIMProper_ShouldReturnException() {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("HAPPY");
            String mood = MoodAnalyserFactory.callMthodeInvoked(moodAnalyzer, "HAP");
            Assert.assertEquals("HAPPY", mood);

        } catch (MoodAnalysisexceptions moodAnalysisexceptions) {
            Assert.assertEquals(MoodAnalysisexceptions.entered.NO_SUCH_METHOD_ERROR,moodAnalysisexceptions.type);

        }


    }
}
