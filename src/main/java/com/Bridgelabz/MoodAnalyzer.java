package com.Bridgelabz;

import com.mood.exceptions.MoodAnalysisexceptions;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer() {

    }

    public MoodAnalyzer(String message)
    {
        this.message=message;
    }

    public String analyzer() throws MoodAnalysisexceptions {

        try {
            if (message.isEmpty())
            {
                throw new MoodAnalysisexceptions("Please enter String");
            }

            if (message.contains("SAD")) {
                    return "SAD";
                } else {
                    return "HAPPY";
                }
            }catch(NullPointerException e)
            {
                throw new MoodAnalysisexceptions("Please enter Proper mood");
            }

    }
}
