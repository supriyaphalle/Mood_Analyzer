package com.Bridgelabz;

import com.mood.exceptions.MoodAnalysisexceptions;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MoodAnalyserFactory {

    public static MoodAnalyzer createMoodAnalyzer() {
        Object myobject = null;
        try {
            Class<?> aClass = Class.forName("com.Bridgelabz.MoodAnalyzer");
            Constructor<?> Moodconstructor = aClass.getConstructor();
            myobject = Moodconstructor.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
         catch (NoSuchMethodException ex) {
        ex.printStackTrace();
        } catch (InstantiationException ex) {
        ex.printStackTrace();
        } catch (IllegalAccessException ex) {
        ex.printStackTrace();
        } catch (InvocationTargetException ex) {
        ex.printStackTrace();
        }
        return (MoodAnalyzer)myobject;
    }

    public static Constructor<?> getConstructor (String param,Class methodParam) throws MoodAnalysisexceptions{
        try {
            Class<?> aClass = Class.forName(param);
            return aClass.getConstructor(methodParam);
        } catch (NoSuchMethodException e) {
                e.printStackTrace();
            throw new MoodAnalysisexceptions(MoodAnalysisexceptions.entered.NO_SUCH_METHOD,e.getMessage());
        }
         catch (ClassNotFoundException e) {
            e.printStackTrace();
             throw new MoodAnalysisexceptions(MoodAnalysisexceptions.entered.NO_SUCH_CLASS,e.getMessage());
        }
    }


}
