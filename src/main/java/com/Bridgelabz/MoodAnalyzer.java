package com.Bridgelabz;

import com.mood.exceptions.MoodAnalysisexceptions;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer() {
        message="HA";
    }

    public MoodAnalyzer(String message)
    {
        this.message=message;
    }

    public String analyzer(String message) throws MoodAnalysisexceptions {
        this.message=message;
        return analyzer();
    }

    public String analyzer() throws MoodAnalysisexceptions {
        try {
            if (message.isEmpty())
            {
                throw new MoodAnalysisexceptions(MoodAnalysisexceptions.entered.Enter_Empty,"Please enter Proper mood");
            }
            if (message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }}catch(NullPointerException e)
            {
                throw new MoodAnalysisexceptions(MoodAnalysisexceptions.entered.Enter_Null,"Please enter Proper mood");
            }
    }
    public boolean equals(Object another){
        if(this.message.equals(((MoodAnalyzer) another).message)){
            return true;
        }
        return false;
    }
}
