package com.Bridgelabz;

import com.mood.exceptions.MoodAnalysisexceptions;
import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class moodAnalyzerTest {
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
//Constructure Parameter
    @Test
    public void givenInput_whenSAD_Constructure_ShouldReturnSad() {
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
    public void givenInput_whenHappyConstructure_ShouldReturnSad() {
        String mood=null;
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in HAPPY mood");
            mood = moodAnalyzer.analyzer();
            Assert.assertNotEquals("SAD",mood);
        }catch (MoodAnalysisexceptions moodAnalysisexceptions){
            moodAnalysisexceptions.printStackTrace();
        }
    }

    ///Enum
    @Test
    public void givenInput_whenEmuncase_ShouldReturnSad() {
        String mood=null;
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
            mood = moodAnalyzer.analyzer();
        }catch (MoodAnalysisexceptions moodAnalysisexceptions){
            Assert.assertEquals(MoodAnalysisexceptions.entered.Enter_Null,moodAnalysisexceptions.type);

        }
    }

    ///////////////////Reflector with default constructure
    @Test
    public void givenDefaultConstructure_MoodAnalyserClass_WhenProper_ShouldReturnObject() {
        MoodAnalyzer moodAnalise = MoodAnalyserFactory.createMoodAnalyzer();
        try {
            String mood= moodAnalise.analyzer();
            Assert.assertEquals("HAPPY",mood);
        } catch (MoodAnalysisexceptions moodAnalysisexceptions) {
            moodAnalysisexceptions.printStackTrace();
        }
    }
//////////////////////// TC 4.1 using equals method
    @Test
    public void givenMoodAnalyserClass_WhenProper_ShouldReturnTrue() {
        MoodAnalyzer moodAnalise = MoodAnalyserFactory.createMoodAnalyzer();
        Assert.assertEquals(new MoodAnalyzer(),moodAnalise);
    }
    ////////////////// crete an exception of class not found
    @Test
    public void givenMoodAnalyser_WhenClassNameImproper_ShouldReturnException() {
        try {
            MoodAnalyserFactory.getConstructor("com.Bridgelabz.MoodAnalyzer1.class",String.class);
        } catch (MoodAnalysisexceptions moodAnalysisexceptions) {
            Assert.assertEquals(MoodAnalysisexceptions.entered.NO_SUCH_CLASS, moodAnalysisexceptions.type);
        }
    }

////////////////////// create an exception of method not found

    @Test
    public void givenMoodAnalyser_WhenMethodNameImproper_ShouldReturnException() {
        try {
            MoodAnalyserFactory.getConstructor("com.Bridgelabz.MoodAnalyzer",Integer.class);

        } catch (MoodAnalysisexceptions moodAnalysisexceptions) {
            Assert.assertEquals(MoodAnalysisexceptions.entered.NO_SUCH_METHOD, moodAnalysisexceptions.type);
        }

    }


    ///////////////////Reflector with parameter constructure
/*    @Test
    public void givenMoodAnalyserClass_WhenProper_ShouldReturnObject() {
        MoodAnalyzer moodAnalise = MoodAnalyserFactory.createMoodAnalyzer("I an in HAPPY mood");
        try {
            String mood= moodAnalise.analyzer();
            Assert.assertEquals("HAPPY",mood);
        } catch (MoodAnalysisexceptions moodAnalysisexceptions) {
            moodAnalysisexceptions.printStackTrace();
        }
    }


 */

////////////

/*    @Test
    public void givenMoodAnalyserClass_WhenProper_ShouldReturn() {
        MoodAnalyzer moodAnalise = MoodAnalyserFactory.createMoodAnalyzer("I am in HAPPY mood");
        Assert.assertEquals(new MoodAnalyzer("I am in HAPPY mood"),moodAnalise);
    }

 */
}
