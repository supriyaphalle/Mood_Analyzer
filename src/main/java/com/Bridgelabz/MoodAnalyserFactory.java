package com.Bridgelabz;

import com.mood.exceptions.MoodAnalysisexceptions;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
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
        } catch (NoSuchMethodException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InvocationTargetException ex) {
            ex.printStackTrace();
        }
        return (MoodAnalyzer) myobject;
    }
/// reflector with parameter constructor
    public static MoodAnalyzer createMoodAnalyzerWithParameterConstructor(String mood) {
        Object myobj = null;
        try {
            Class<?> aClass = Class.forName("com.Bridgelabz.MoodAnalyzer");
            Constructor<?> constructor = aClass.getConstructor(String.class);
            myobj = constructor.newInstance(mood);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return (MoodAnalyzer) myobj;
    }
//// create exception for no_SUCH_METHOD and NO_SUCH_CLASS
    public static Constructor<?> getConstructor(String param, Class methodParam) throws MoodAnalysisexceptions {
        try {
            Class<?> aClass = Class.forName(param);
            return aClass.getConstructor(methodParam);
        } catch (NoSuchMethodException e) {
            throw new MoodAnalysisexceptions(MoodAnalysisexceptions.entered.NO_SUCH_METHOD, e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new MoodAnalysisexceptions(MoodAnalysisexceptions.entered.NO_SUCH_CLASS, e.getMessage());
        }
    }
//// Invoke method
    public static String callMthodeInvoked(Object moodeObject, String mood) throws MoodAnalysisexceptions {
        // Object invoke =null;

        try {
            Class<?> aClass = Class.forName("com.Bridgelabz.MoodAnalyzer");
            Method declaredMethod = aClass.getDeclaredMethod("analyzer", String.class);
            return (String) declaredMethod.invoke(moodeObject, mood);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new MoodAnalysisexceptions(MoodAnalysisexceptions.entered.NO_SUCH_METHOD_ERROR,e.getMessage());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
////////////////// set field value
    public static String setFieldMethods(Object obj,String name,String message) throws MoodAnalysisexceptions{
        Object returnValue=null;
        try {
        Field messsageField = obj.getClass().getDeclaredField(name);
        messsageField.setAccessible(true);
        messsageField.set(obj,message);
         returnValue= obj.getClass().getDeclaredMethod("analyzer").invoke(obj);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            throw new MoodAnalysisexceptions(MoodAnalysisexceptions.entered.NO_SUCH_FIELD_EXCEPTION,e.getMessage());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            throw new MoodAnalysisexceptions(MoodAnalysisexceptions.entered.Enter_Null,e.getMessage());
        }
        return (String)returnValue;
    }

}