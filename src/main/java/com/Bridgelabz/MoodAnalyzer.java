package com.Bridgelabz;

import com.mood.exceptions.MoodAnalysisexceptions;

public class MoodAnalyzer {

    public MoodAnalyzer() {
    }


    public String analyzer(String messsage ) throws MoodAnalysisexceptions {

        try {
            if (messsage.isEmpty())
            {
                throw new MoodAnalysisexceptions("Please enter String");
            }

                if (messsage.contains("SAD")) {
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
