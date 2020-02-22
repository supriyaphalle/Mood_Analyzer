package com.mood.exceptions;

public class MoodAnalysisexceptions extends Exception {
    public entered type;
    public enum entered {
        Enter_Null,Enter_Empty,NO_SUCH_METHOD,NO_SUCH_CLASS,NO_SUCH_METHOD_ERROR,NO_SUCH_FIELD_EXCEPTION;
    }

    public MoodAnalysisexceptions(entered type,String message) {
        super(message);
        this.type=type;
    }

}
